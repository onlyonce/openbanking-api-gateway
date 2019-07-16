package hu.dpc.openbanking.apigateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import hu.dpc.common.http.HttpUtils;
import hu.dpc.openbanking.apigateway.entities.accounts.UpdateConsentResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.Nullable;
import uk.org.openbanking.v3_1_2.accounts.OBReadConsentResponse1;
import uk.org.openbanking.v3_1_2.payments.OBWriteDomesticConsentResponse3;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FineractGatewayPayments extends FineractGateway {
    private static final Log LOG = LogFactory.getLog(FineractGatewayPayments.class);

    @Nullable
    public static OBWriteDomesticConsentResponse3 getConsent(final ServletConfig servletConfig, final HttpServletRequest request) {
        checkServletConfig(servletConfig);

        try {
            final RequestContent requestContent = new RequestContent(request);
            final Map<String, String> headers = populateHeaders(requestContent);
            final OBWriteDomesticConsentResponse3 result = HttpUtils.doGET(OBWriteDomesticConsentResponse3.class, openBankingLogicURL + reviewUrl("/pis-consents/" + requestContent.getConsentId()), headers);
            return result;
        } catch (final Exception e) {
            LOG.error("Something went wrong!", e);
        }

        return null;
    }

    public static boolean updateConsent(final ServletConfig servletConfig, final String consentId, final String userName, final OBReadConsentResponse1 updateConsentRequest) {
        checkServletConfig(servletConfig);

        final ObjectMapper mapper = new ObjectMapper();
        try {
            final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(updateConsentRequest);

            final Map<String, String> headers = new HashMap<>();
            headers.put("Accept", "application/json");
            headers.put("Content-Type", "application/json");
            headers.put("x-fapi-interaction-id", UUID.randomUUID().toString());
            headers.put("user-id", userName);
            headers.put("consent-id", consentId);

            final UpdateConsentResponse response = HttpUtils.call(HttpUtils.HTTP_METHOD.PUT, UpdateConsentResponse.class, openBankingLogicURL + reviewUrl("/pis-consents/" + consentId), headers, json);
            return response.getResponseCode() == 200;
        } catch (final Exception e) {
            LOG.error("Error on updateConsent", e);
            return false;
        }
    }


}
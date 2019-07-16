/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.accounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.
 */
@ApiModel(description = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBTransactionCashBalance {
    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode2 creditDebitIndicator = null;

    @JsonProperty("Type")
    private OBBalanceType1Code type = null;

    @JsonProperty("Amount")
    private OBTransactionCashBalanceAmount amount = null;

    public OBTransactionCashBalance creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     **/
    @JsonProperty("CreditDebitIndicator")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBCreditDebitCode2 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransactionCashBalance type(OBBalanceType1Code type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @JsonProperty("Type")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBBalanceType1Code getType() {
        return type;
    }

    public void setType(OBBalanceType1Code type) {
        this.type = type;
    }

    public OBTransactionCashBalance amount(OBTransactionCashBalanceAmount amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @JsonProperty("Amount")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBTransactionCashBalanceAmount getAmount() {
        return amount;
    }

    public void setAmount(OBTransactionCashBalanceAmount amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditDebitIndicator, type, amount);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransactionCashBalance obTransactionCashBalance = (OBTransactionCashBalance) o;
        return Objects.equals(this.creditDebitIndicator, obTransactionCashBalance.creditDebitIndicator) &&
                Objects.equals(this.type, obTransactionCashBalance.type) &&
                Objects.equals(this.amount, obTransactionCashBalance.amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransactionCashBalance {\n");

        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

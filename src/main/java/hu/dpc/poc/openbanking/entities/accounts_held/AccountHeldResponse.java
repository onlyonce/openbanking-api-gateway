package hu.dpc.poc.openbanking.entities.accounts_held;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountHeldResponse {
    @JsonProperty("Data")
    private Accounts accounts;

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(final Accounts accounts) {
        this.accounts = accounts;
    }
}

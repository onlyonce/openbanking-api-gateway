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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Tier band set details
 */
@ApiModel(description = "Tier band set details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OverdraftOverdraftTierBandSet {
    @JsonProperty("OverdraftTierBand")
    private List<OverdraftOverdraftTierBand> overdraftTierBand = null;
    @JsonProperty("OverdraftType")
    private OverdraftTypeEnum overdraftType = null;
    @JsonProperty("TierBandMethod")
    private TierBandMethodEnum tierBandMethod = null;
    @JsonProperty("AuthorisedIndicator")
    private Boolean authorisedIndicator = null;
    @JsonProperty("Identification")
    private String identification = null;
    @JsonProperty("OverdraftFeesCharges")
    private List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges = null;
    @JsonProperty("BufferAmount")
    private String bufferAmount = null;
    @JsonProperty("Notes")
    private List<String> notes = null;

    public OverdraftOverdraftTierBandSet overdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
        return this;
    }

    public OverdraftOverdraftTierBandSet addOverdraftTierBandItem(OverdraftOverdraftTierBand overdraftTierBandItem) {
        if (this.overdraftTierBand == null) {
            this.overdraftTierBand = new ArrayList<>();
        }
        this.overdraftTierBand.add(overdraftTierBandItem);
        return this;
    }

    /**
     * Provides overdraft details for a specific tier or band
     *
     * @return overdraftTierBand
     **/
    @JsonProperty("OverdraftTierBand")
    @ApiModelProperty(value = "Provides overdraft details for a specific tier or band")
    @Size(min = 1)
    public List<OverdraftOverdraftTierBand> getOverdraftTierBand() {
        return overdraftTierBand;
    }

    public void setOverdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
        this.overdraftTierBand = overdraftTierBand;
    }

    public OverdraftOverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
        this.overdraftType = overdraftType;
        return this;
    }

    /**
     * An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time.
     *
     * @return overdraftType
     **/
    @JsonProperty("OverdraftType")
    @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")
    public OverdraftTypeEnum getOverdraftType() {
        return overdraftType;
    }

    public void setOverdraftType(OverdraftTypeEnum overdraftType) {
        this.overdraftType = overdraftType;
    }

    public OverdraftOverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
        return this;
    }

    /**
     * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
     *
     * @return tierBandMethod
     **/
    @JsonProperty("TierBandMethod")
    @ApiModelProperty(value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
    public TierBandMethodEnum getTierBandMethod() {
        return tierBandMethod;
    }

    public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
        this.tierBandMethod = tierBandMethod;
    }

    public OverdraftOverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
        return this;
    }

    /**
     * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
     *
     * @return authorisedIndicator
     **/
    @JsonProperty("AuthorisedIndicator")
    @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")
    public Boolean AuthorisedIndicator() {
        return authorisedIndicator;
    }

    public void setAuthorisedIndicator(Boolean authorisedIndicator) {
        this.authorisedIndicator = authorisedIndicator;
    }

    public OverdraftOverdraftTierBandSet identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a overdraft product.
     *
     * @return identification
     **/
    @JsonProperty("Identification")
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")
    @Size(min = 1, max = 35)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OverdraftOverdraftTierBandSet overdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
        return this;
    }

    public OverdraftOverdraftTierBandSet addOverdraftFeesChargesItem(OverdraftOverdraftFeesCharges1 overdraftFeesChargesItem) {
        if (this.overdraftFeesCharges == null) {
            this.overdraftFeesCharges = new ArrayList<>();
        }
        this.overdraftFeesCharges.add(overdraftFeesChargesItem);
        return this;
    }

    /**
     * Overdraft fees and charges details
     *
     * @return overdraftFeesCharges
     **/
    @JsonProperty("OverdraftFeesCharges")
    @ApiModelProperty(value = "Overdraft fees and charges details")
    public List<OverdraftOverdraftFeesCharges1> getOverdraftFeesCharges() {
        return overdraftFeesCharges;
    }

    public void setOverdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
        this.overdraftFeesCharges = overdraftFeesCharges;
    }

    public OverdraftOverdraftTierBandSet bufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
        return this;
    }

    /**
     * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
     *
     * @return bufferAmount
     **/
    @JsonProperty("BufferAmount")
    @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getBufferAmount() {
        return bufferAmount;
    }

    public void setBufferAmount(String bufferAmount) {
        this.bufferAmount = bufferAmount;
    }

    public OverdraftOverdraftTierBandSet notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftOverdraftTierBandSet addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the overdraft Tier Band Set details
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraftTierBand, overdraftType, tierBandMethod, authorisedIndicator, identification, overdraftFeesCharges, bufferAmount, notes);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftOverdraftTierBandSet overdraftOverdraftTierBandSet = (OverdraftOverdraftTierBandSet) o;
        return Objects.equals(this.overdraftTierBand, overdraftOverdraftTierBandSet.overdraftTierBand) &&
                Objects.equals(this.overdraftType, overdraftOverdraftTierBandSet.overdraftType) &&
                Objects.equals(this.tierBandMethod, overdraftOverdraftTierBandSet.tierBandMethod) &&
                Objects.equals(this.authorisedIndicator, overdraftOverdraftTierBandSet.authorisedIndicator) &&
                Objects.equals(this.identification, overdraftOverdraftTierBandSet.identification) &&
                Objects.equals(this.overdraftFeesCharges, overdraftOverdraftTierBandSet.overdraftFeesCharges) &&
                Objects.equals(this.bufferAmount, overdraftOverdraftTierBandSet.bufferAmount) &&
                Objects.equals(this.notes, overdraftOverdraftTierBandSet.notes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftOverdraftTierBandSet {\n");

        sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
        sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
        sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
        sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
        sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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


    /**
     * An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time.
     */
    public enum OverdraftTypeEnum {
        COMMITTED("Committed"),

        ONDEMAND("OnDemand");

        private String value;

        OverdraftTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OverdraftTypeEnum fromValue(String text) {
            for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
     */
    public enum TierBandMethodEnum {
        BANDED("Banded"),

        TIERED("Tiered"),

        WHOLE("Whole");

        private String value;

        TierBandMethodEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TierBandMethodEnum fromValue(String text) {
            for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

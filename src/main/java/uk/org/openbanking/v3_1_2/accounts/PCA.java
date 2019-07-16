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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * PCA
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PCA {
    @JsonProperty("Overdraft")
    private Overdraft1 overdraft = null;

    @JsonProperty("ProductDetails")
    private ProductDetails1 productDetails = null;

    @JsonProperty("OtherFeesCharges")
    private OtherFeesCharges otherFeesCharges = null;

    @JsonProperty("CreditInterest")
    private CreditInterest1 creditInterest = null;

    public PCA overdraft(Overdraft1 overdraft) {
        this.overdraft = overdraft;
        return this;
    }

    /**
     * Get overdraft
     *
     * @return overdraft
     **/
    @JsonProperty("Overdraft")
    @ApiModelProperty(value = "")
    public Overdraft1 getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(Overdraft1 overdraft) {
        this.overdraft = overdraft;
    }

    public PCA productDetails(ProductDetails1 productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * Get productDetails
     *
     * @return productDetails
     **/
    @JsonProperty("ProductDetails")
    @ApiModelProperty(value = "")
    public ProductDetails1 getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails1 productDetails) {
        this.productDetails = productDetails;
    }

    public PCA otherFeesCharges(OtherFeesCharges otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    /**
     * Get otherFeesCharges
     *
     * @return otherFeesCharges
     **/
    @JsonProperty("OtherFeesCharges")
    @ApiModelProperty(value = "")
    public OtherFeesCharges getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    public PCA creditInterest(CreditInterest1 creditInterest) {
        this.creditInterest = creditInterest;
        return this;
    }

    /**
     * Get creditInterest
     *
     * @return creditInterest
     **/
    @JsonProperty("CreditInterest")
    @ApiModelProperty(value = "")
    public CreditInterest1 getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(CreditInterest1 creditInterest) {
        this.creditInterest = creditInterest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraft, productDetails, otherFeesCharges, creditInterest);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PCA PCA = (PCA) o;
        return Objects.equals(this.overdraft, PCA.overdraft) &&
                Objects.equals(this.productDetails, PCA.productDetails) &&
                Objects.equals(this.otherFeesCharges, PCA.otherFeesCharges) &&
                Objects.equals(this.creditInterest, PCA.creditInterest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PCA {\n");

        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
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

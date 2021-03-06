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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadDataStatement2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadDataStatement2 {
    @JsonProperty("Statement")
    private List<OBStatement2> statement = null;

    public OBReadDataStatement2 statement(List<OBStatement2> statement) {
        this.statement = statement;
        return this;
    }

    public OBReadDataStatement2 addStatementItem(OBStatement2 statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        this.statement.add(statementItem);
        return this;
    }

    /**
     * Get statement
     *
     * @return statement
     **/
    @JsonProperty("Statement")
    @ApiModelProperty(value = "")
    public List<OBStatement2> getStatement() {
        return statement;
    }

    public void setStatement(List<OBStatement2> statement) {
        this.statement = statement;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDataStatement2 obReadDataStatement2 = (OBReadDataStatement2) o;
        return Objects.equals(this.statement, obReadDataStatement2.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statement);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDataStatement2 {\n");

        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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


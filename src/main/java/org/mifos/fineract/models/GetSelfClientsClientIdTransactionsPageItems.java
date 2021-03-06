/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * GetSelfClientsClientIdTransactionsPageItems
 */

public class GetSelfClientsClientIdTransactionsPageItems {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("officeId")
    private Integer officeId = null;

    @SerializedName("officeName")
    private String officeName = null;

    @SerializedName("type")
    private GetSelfClientsClientIdTransactionsType type = null;

    @SerializedName("date")
    private LocalDate date = null;

    @SerializedName("currency")
    private GetSelfClientsSavingsAccountsCurrency currency = null;

    @SerializedName("amount")
    private Double amount = null;

    @SerializedName("submittedOnDate")
    private LocalDate submittedOnDate = null;

    @SerializedName("reversed")
    private Boolean reversed = null;

    public GetSelfClientsClientIdTransactionsPageItems id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "226", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetSelfClientsClientIdTransactionsPageItems officeId(Integer officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public GetSelfClientsClientIdTransactionsPageItems officeName(String officeName) {
        this.officeName = officeName;
        return this;
    }

    /**
     * Get officeName
     *
     * @return officeName
     **/
    @ApiModelProperty(example = "Head Office", value = "")
    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public GetSelfClientsClientIdTransactionsPageItems type(GetSelfClientsClientIdTransactionsType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(value = "")
    public GetSelfClientsClientIdTransactionsType getType() {
        return type;
    }

    public void setType(GetSelfClientsClientIdTransactionsType type) {
        this.type = type;
    }

    public GetSelfClientsClientIdTransactionsPageItems date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     **/
    @ApiModelProperty(example = "[2015, 9, 2]", value = "")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public GetSelfClientsClientIdTransactionsPageItems currency(GetSelfClientsSavingsAccountsCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetSelfClientsSavingsAccountsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetSelfClientsSavingsAccountsCurrency currency) {
        this.currency = currency;
    }

    public GetSelfClientsClientIdTransactionsPageItems amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @ApiModelProperty(example = "22.0", value = "")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public GetSelfClientsClientIdTransactionsPageItems submittedOnDate(LocalDate submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
        return this;
    }

    /**
     * Get submittedOnDate
     *
     * @return submittedOnDate
     **/
    @ApiModelProperty(example = "[2015, 9, 2]", value = "")
    public LocalDate getSubmittedOnDate() {
        return submittedOnDate;
    }

    public void setSubmittedOnDate(LocalDate submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    public GetSelfClientsClientIdTransactionsPageItems reversed(Boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    /**
     * Get reversed
     *
     * @return reversed
     **/
    @ApiModelProperty(example = "false", value = "")
    public Boolean isReversed() {
        return reversed;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSelfClientsClientIdTransactionsPageItems getSelfClientsClientIdTransactionsPageItems = (GetSelfClientsClientIdTransactionsPageItems) o;
        return Objects.equals(this.id, getSelfClientsClientIdTransactionsPageItems.id) &&
                Objects.equals(this.officeId, getSelfClientsClientIdTransactionsPageItems.officeId) &&
                Objects.equals(this.officeName, getSelfClientsClientIdTransactionsPageItems.officeName) &&
                Objects.equals(this.type, getSelfClientsClientIdTransactionsPageItems.type) &&
                Objects.equals(this.date, getSelfClientsClientIdTransactionsPageItems.date) &&
                Objects.equals(this.currency, getSelfClientsClientIdTransactionsPageItems.currency) &&
                Objects.equals(this.amount, getSelfClientsClientIdTransactionsPageItems.amount) &&
                Objects.equals(this.submittedOnDate, getSelfClientsClientIdTransactionsPageItems.submittedOnDate) &&
                Objects.equals(this.reversed, getSelfClientsClientIdTransactionsPageItems.reversed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, officeId, officeName, type, date, currency, amount, submittedOnDate, reversed);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSelfClientsClientIdTransactionsPageItems {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
        sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
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


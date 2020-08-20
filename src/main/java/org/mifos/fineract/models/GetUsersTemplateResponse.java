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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GetUsersTemplateResponse
 */

public class GetUsersTemplateResponse {
    @SerializedName("allowedOffices")
    private List<OfficeData> allowedOffices = null;

    @SerializedName("availableRoles")
    private List<RoleData> availableRoles = null;

    @SerializedName("selfServiceRoles")
    private List<RoleData> selfServiceRoles = null;

    public GetUsersTemplateResponse allowedOffices(List<OfficeData> allowedOffices) {
        this.allowedOffices = allowedOffices;
        return this;
    }

    public GetUsersTemplateResponse addAllowedOfficesItem(OfficeData allowedOfficesItem) {
        if (this.allowedOffices == null) {
            this.allowedOffices = new ArrayList<OfficeData>();
        }
        this.allowedOffices.add(allowedOfficesItem);
        return this;
    }

    /**
     * Get allowedOffices
     *
     * @return allowedOffices
     **/
    @ApiModelProperty(value = "")
    public List<OfficeData> getAllowedOffices() {
        return allowedOffices;
    }

    public void setAllowedOffices(List<OfficeData> allowedOffices) {
        this.allowedOffices = allowedOffices;
    }

    public GetUsersTemplateResponse availableRoles(List<RoleData> availableRoles) {
        this.availableRoles = availableRoles;
        return this;
    }

    public GetUsersTemplateResponse addAvailableRolesItem(RoleData availableRolesItem) {
        if (this.availableRoles == null) {
            this.availableRoles = new ArrayList<RoleData>();
        }
        this.availableRoles.add(availableRolesItem);
        return this;
    }

    /**
     * Get availableRoles
     *
     * @return availableRoles
     **/
    @ApiModelProperty(value = "")
    public List<RoleData> getAvailableRoles() {
        return availableRoles;
    }

    public void setAvailableRoles(List<RoleData> availableRoles) {
        this.availableRoles = availableRoles;
    }

    public GetUsersTemplateResponse selfServiceRoles(List<RoleData> selfServiceRoles) {
        this.selfServiceRoles = selfServiceRoles;
        return this;
    }

    public GetUsersTemplateResponse addSelfServiceRolesItem(RoleData selfServiceRolesItem) {
        if (this.selfServiceRoles == null) {
            this.selfServiceRoles = new ArrayList<RoleData>();
        }
        this.selfServiceRoles.add(selfServiceRolesItem);
        return this;
    }

    /**
     * Get selfServiceRoles
     *
     * @return selfServiceRoles
     **/
    @ApiModelProperty(value = "")
    public List<RoleData> getSelfServiceRoles() {
        return selfServiceRoles;
    }

    public void setSelfServiceRoles(List<RoleData> selfServiceRoles) {
        this.selfServiceRoles = selfServiceRoles;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUsersTemplateResponse getUsersTemplateResponse = (GetUsersTemplateResponse) o;
        return Objects.equals(this.allowedOffices, getUsersTemplateResponse.allowedOffices) &&
                Objects.equals(this.availableRoles, getUsersTemplateResponse.availableRoles) &&
                Objects.equals(this.selfServiceRoles, getUsersTemplateResponse.selfServiceRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedOffices, availableRoles, selfServiceRoles);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUsersTemplateResponse {\n");

        sb.append("    allowedOffices: ").append(toIndentedString(allowedOffices)).append("\n");
        sb.append("    availableRoles: ").append(toIndentedString(availableRoles)).append("\n");
        sb.append("    selfServiceRoles: ").append(toIndentedString(selfServiceRoles)).append("\n");
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

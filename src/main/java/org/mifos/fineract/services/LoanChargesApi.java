package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface LoanChargesApi {
    /**
     * Delete a Loan Charge
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     *
     * @param loanId   loanId (required)
     * @param chargeId chargeId (required)
     * @return Call&lt;DeleteLoansLoanIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("loans/{loanId}/charges/{chargeId}")
    Call<DeleteLoansLoanIdChargesChargeIdResponse> deleteLoanCharge(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Pay Loan Charge
     * Loan Charge will be paid if the loan is linked with a savings account
     *
     * @param loanId   loanId (required)
     * @param chargeId chargeId (required)
     * @param body     body (required)
     * @param command  command (optional)
     * @return Call&lt;PostLoansLoanIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/charges/{chargeId}")
    Call<PostLoansLoanIdChargesChargeIdResponse> executeLoanCharge(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PostLoansLoanIdChargesChargeIdRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * Create a Loan Charge
     * It Creates a Loan Charge
     *
     * @param loanId  loanId (required)
     * @param body    body (required)
     * @param command command (optional)
     * @return Call&lt;PostLoansLoanIdChargesResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("loans/{loanId}/charges")
    Call<PostLoansLoanIdChargesResponse> executeLoanCharge_0(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdChargesRequest body, @retrofit2.http.Query("command") String command
    );

    /**
     * List Loan Charges
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     *
     * @param loanId loanId (required)
     * @return Call&lt;List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/charges")
    Call<List<GetLoansLoanIdChargesChargeIdResponse>> retrieveAllLoanCharges(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * Retrieve a Loan Charge
     * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     *
     * @param loanId   loanId (required)
     * @param chargeId chargeId (required)
     * @return Call&lt;GetLoansLoanIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/charges/{chargeId}")
    Call<GetLoansLoanIdChargesChargeIdResponse> retrieveLoanCharge(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
    );

    /**
     * Retrieve Loan Charges Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/charges/template
     *
     * @param loanId loanId (required)
     * @return Call&lt;GetLoansLoanIdChargesTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("loans/{loanId}/charges/template")
    Call<GetLoansLoanIdChargesTemplateResponse> retrieveTemplate(
            @retrofit2.http.Path("loanId") Long loanId
    );

    /**
     * Update a Loan Charge
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     *
     * @param loanId   loanId (required)
     * @param chargeId chargeId (required)
     * @param body     body (required)
     * @return Call&lt;PutLoansLoanIdChargesChargeIdResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("loans/{loanId}/charges/{chargeId}")
    Call<PutLoansLoanIdChargesChargeIdResponse> updateLoanCharge(
            @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId, @retrofit2.http.Body PutLoansLoanIdChargesChargeIdRequest body
    );

}

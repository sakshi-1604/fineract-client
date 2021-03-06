package org.mifos.fineract.services;

import org.mifos.fineract.models.GetGlobalConfigurationsResponse;
import org.mifos.fineract.models.PutGlobalConfigurationsRequest;
import org.mifos.fineract.models.PutGlobalConfigurationsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

import java.util.List;

public interface GlobalConfigurationApi {
    /**
     * Retrieve Global Configuration | Retrieve Global Configuration for surveys
     * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
     *
     * @param survey survey (optional, default to false)
     * @return Call&lt;List&lt;GetGlobalConfigurationsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("configurations")
    Call<List<GetGlobalConfigurationsResponse>> retrieveConfiguration(
            @retrofit2.http.Query("survey") Boolean survey
    );

    /**
     * Retrieve Global Configuration
     * Returns a global enable/disable configurations.  Example Requests:  configurations/1
     *
     * @param configId configId (required)
     * @return Call&lt;GetGlobalConfigurationsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("configurations/{configId}")
    Call<GetGlobalConfigurationsResponse> retrieveOne(
            @retrofit2.http.Path("configId") Long configId
    );

    /**
     * Update Global Configuration
     * Updates an enable/disable global configuration item.
     *
     * @param configId configId (required)
     * @param body     body (required)
     * @return Call&lt;PutGlobalConfigurationsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("configurations/{configId}")
    Call<PutGlobalConfigurationsResponse> updateConfiguration(
            @retrofit2.http.Path("configId") Long configId, @retrofit2.http.Body PutGlobalConfigurationsRequest body
    );

}

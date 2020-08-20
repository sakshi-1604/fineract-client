package org.mifos.fineract;

import org.mifos.fineract.models.PostAuthenticationResponse;
import org.mifos.fineract.services.AuthenticationHttpBasicApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by grandolf49 on 20-08-2020
 * <p>
 * An example to illustrate the usage of consuming Fineract Client Library.
 */
public class Main {
    public static void main(String[] args) {
        FineractApiClient fineractApiClient = new FineractApiClient();
        AuthenticationHttpBasicApi authApi = fineractApiClient.createService(AuthenticationHttpBasicApi.class);
        Call<PostAuthenticationResponse> call = authApi.authenticate("mifos", "password");
        call.enqueue(new Callback<PostAuthenticationResponse>() {
            @Override
            public void onResponse(Call<PostAuthenticationResponse> call, Response<PostAuthenticationResponse> response) {
                System.out.println(response.toString());
                PostAuthenticationResponse body = response.body();
                if (body != null) {
                    System.out.println(body.toString());
                }
            }

            @Override
            public void onFailure(Call<PostAuthenticationResponse> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }
}

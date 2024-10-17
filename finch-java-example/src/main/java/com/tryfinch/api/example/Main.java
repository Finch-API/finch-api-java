package com.tryfinch.api.example;

import com.tryfinch.api.client.FinchClient;
import com.tryfinch.api.client.okhttp.FinchOkHttpClient;
import com.tryfinch.api.models.*;

public class Main {
    // follow the steps here to get these values:
    // https://developer.tryfinch.com/how-finch-works/quickstart#open-finch-connect-in-sandbox-mode
    static final String CLIENT_ID = System.getenv("FINCH_CLIENT_ID");
    static final String CLIENT_SECRET = System.getenv("FINCH_CLIENT_SECRET");
    static final String ACCESS_CODE = System.getenv("FINCH_ACCESS_CODE");
    static final String REDIRECT_URI = System.getenv("FINCH_REDIRECT_URI");

    static final FinchClient client = FinchOkHttpClient.builder()
            .clientId(CLIENT_ID)
            .clientSecret(CLIENT_SECRET)
            .build();

    public static void main(String[] args) {
        System.out.println("Creating access token:");
        CreateAccessTokenResponse response = client.accessTokens()
                .create(AccessTokenCreateParams.builder()
                        .code(ACCESS_CODE)
                        .redirectUri(REDIRECT_URI)
                        .build());
        System.out.println("Access token: " + response.accessToken());
    }
}

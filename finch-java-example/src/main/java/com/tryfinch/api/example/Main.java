package com.tryfinch.api.example;

import com.tryfinch.api.client.FinchClient;
import com.tryfinch.api.client.okhttp.FinchOkHttpClient;
import com.tryfinch.api.models.*;

public class Main {
    static final String CLIENT_ID = System.getenv("FINCH_CLIENT_ID");
    static final String CLIENT_SECRET = System.getenv("FINCH_CLIENT_SECRET");

    static final FinchClient client = FinchOkHttpClient.builder()
            .clientId(CLIENT_ID)
            .clientSecret(CLIENT_SECRET)
            .build();

    public static void main(String[] args) {
        System.out.println("Creating access token:");
        CreateAccessTokenResponse response = client.accessTokens()
                .create(AccessTokenCreateParams.builder()
                        .code("your-code")
                        .redirectUri("https://example.com")
                        .build());
        System.out.println(response.accessToken());
    }
}

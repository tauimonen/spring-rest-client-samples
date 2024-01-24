package dev.tau.restclientsamples;

import org.springframework.web.client.RestClient;

public class PostService {

    private final RestClient restClient;

    public PostService(RestClient.Builder builder) {
        this.restClient = builder.build();
    }
}

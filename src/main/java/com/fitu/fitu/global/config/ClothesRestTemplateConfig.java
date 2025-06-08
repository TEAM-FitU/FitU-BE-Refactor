package com.fitu.fitu.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClothesRestTemplateConfig {

    @Value("${ai.model.base-url}")
    private String aiModelBaseUrl;

    @Bean("clothesRestTemplate")
    public RestTemplate restTemplate() {
        // 가장 간단한 방법으로 RestTemplate 생성
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Bean("aiModelBaseUrl")
    public String aiModelBaseUrl() {
        return aiModelBaseUrl;
    }
}
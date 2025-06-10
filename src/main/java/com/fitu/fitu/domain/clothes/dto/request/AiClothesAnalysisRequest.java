package com.fitu.fitu.domain.clothes.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AiClothesAnalysisRequest(
        @JsonProperty("s3_url") String imageUrl
) {

}

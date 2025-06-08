package com.fitu.fitu.domain.clothes.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fitu.fitu.domain.clothes.entity.enums.Category;
import com.fitu.fitu.domain.clothes.entity.enums.Color;
import com.fitu.fitu.domain.clothes.entity.enums.Pattern;
import com.fitu.fitu.domain.clothes.entity.enums.Type;

public record AiAnalysisResult(
        boolean isValidClothes,
        @JsonProperty("category") Type type,
        @JsonProperty("subcategory") Category category,
        Pattern pattern,
        @JsonProperty("tone") Color color,
        @JsonProperty("segmented_image_path") String segmentedImagePath,
        String errorMessage) {

    public static AiAnalysisResult success(final Type type, final Category category, final Pattern pattern,
            final Color color,
            final String segmentedImagePath) {
        return new AiAnalysisResult(true, type, category, pattern, color, segmentedImagePath, null);
    }

    public static AiAnalysisResult failure(final String errorMessage) {
        return new AiAnalysisResult(false, null, null, null, null, null, errorMessage);
    }
}

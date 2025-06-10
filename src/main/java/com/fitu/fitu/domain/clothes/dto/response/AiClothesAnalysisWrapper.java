package com.fitu.fitu.domain.clothes.dto.response;

import java.util.List;

public record AiClothesAnalysisWrapper(
        String status, List<AiClothesAnalysisResult> analyses
) {

}

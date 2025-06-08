package com.fitu.fitu.domain.clothes.dto.response;

import java.util.List;

public record AiAnalysisWrapper(String status, List<AiAnalysisResult> analyses) {

}

package com.fitu.fitu.domain.clothes.dto.request;

import org.springframework.web.multipart.MultipartFile;

public record ClothesAnalysisRequest(MultipartFile clothesImage) {
}

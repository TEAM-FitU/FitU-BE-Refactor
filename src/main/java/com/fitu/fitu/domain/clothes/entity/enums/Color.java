package com.fitu.fitu.domain.clothes.entity.enums;
 
import com.fasterxml.jackson.annotation.JsonCreator;

public enum Color {
    LIGHT, // 밝은 계열
    DARK, // 어두운 계열
    NOT_CONSIDERED; // 고려하지 않음

    @JsonCreator
    public static Color fromJson(String koreanTone) {

        // 위쪽 3개는 프론트측 요청 처리, 아래쪽 2개는 ai 분석 결과값 데이터 후처리 용도
        switch (koreanTone) {
            case "LIGHT":
                return LIGHT;
            case "DARK":
                return DARK;
            case "NOT_CONSIDERED":
                return NOT_CONSIDERED;
            case "밝은 톤":
                return LIGHT;
            case "어두운 톤":
                return DARK;
            default:
                return null;
        }
    }
}

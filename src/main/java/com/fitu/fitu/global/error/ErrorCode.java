package com.fitu.fitu.global.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

    /* COMMON ERROR */
    INTERNAL_SERVER_ERROR(500, "COMMON001", "Internal Server Error"),
    INVALID_INPUT_VALUE(400, "COMMON002", "Invalid Input Value"),
    ENTITY_NOT_FOUND(400, "COMMON003", "Entity Not Found"),

    /* USER ERROR */

    /* CLOTHES ERROR */
    CLOTHES_NOT_FOUND(404, "CLOTHES001", "의류를 찾을 수 없습니다"),
    CLOTHES_ACCESS_DENIED(403, "CLOTHES002", "해당 의류에 접근 권한이 없습니다"),
    CLOTHES_AI_ANALYSIS_FAILED(500, "CLOTHES004", "의류 AI 분석에 실패했습니다"),
    CLOTHES_IMAGE_PROCESSING_ERROR(500, "CLOTHES005", "의류 이미지 처리 중 오류가 발생했습니다"),
    CLOTHES_INVALID_CLOTHES_COMBINATION(400, "CLOTHES006", "유효하지 않은 의류 조합입니다"),
    CLOTHES_ATTRIBUTES_REQUIRED(400, "CLOTHES008", "의류 속성이 필요합니다"),

    /* S3 ERROR */
    S3_URL_INVALID(400, "S3001", "잘못된 S3 URL 형식입니다"),
    S3_FILE_READ_ERROR(500, "S3002", "S3 파일 읽기 오류가 발생했습니다"),
    S3_UPLOAD_ERROR(500, "S3002", "S3 파일 업로드에 실패했습니다"),
    S3_DELETE_ERROR(500, "S3003", "S3 파일 삭제에 실패했습니다");

    /* RECOMMENDATION ERROR */

    private final int status;
    private final String code;
    private final String message;

    ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}

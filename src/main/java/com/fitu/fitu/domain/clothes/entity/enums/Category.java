package com.fitu.fitu.domain.clothes.entity.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Category {
    BLOUSE, // 블라우스
    CARDIGAN, // 가디건
    COAT, // 코트
    JACKET, // 자켓
    JUMPER, // 점퍼
    SHIRT, // 셔츠
    SWEATER, // 스웨터
    TSHIRT, // 티셔츠
    VEST, // 베스트
    ACTIVEWEAR, // 편한 활동복
    JEANS, // 청바지
    PANTS, // 일반 바지
    SHORTS, // 반바지
    SKIRT, // 치마
    SLACKS, // 슬랙스(정장 바지)
    DRESS, // 드레스
    JUMPSUIT; // 점프수트

    @JsonCreator
    public static Category fromJson(String jsonValue) {
        if ("onepiece-dress-".equals(jsonValue) || "onepiece-dress".equals(jsonValue)) {
            return DRESS;
        } else if ("onepiece-jumpsuite-".equals(jsonValue) || "onepiece-jumpsuite".equals(jsonValue)) {
            return JUMPSUIT;
        } else if ("t-shirt".equals(jsonValue)) {
            return TSHIRT;
        } else {
            return Arrays.stream(Category.values())
                    .filter(ct -> ct.name().equalsIgnoreCase(jsonValue))
                    .findFirst()
                    .orElse(null);
        }
    }
}

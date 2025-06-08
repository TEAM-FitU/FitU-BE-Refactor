package com.fitu.fitu.domain.clothes.entity.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Type {
    TOP, // 상의
    BOTTOM, // 하의
    ONEPIECE; // 원피스

    @JsonCreator
    public static Type fromJson(String jsonValue) {
        return Arrays.stream(Type.values())
                .filter(type -> type.name().equalsIgnoreCase(jsonValue))
                .findFirst()
                .orElse(null);
    }
}

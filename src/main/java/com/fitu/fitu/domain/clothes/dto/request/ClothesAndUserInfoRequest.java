package com.fitu.fitu.domain.clothes.dto.request;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
 
import com.fitu.fitu.domain.user.entity.enums.Gender;
import com.fitu.fitu.domain.user.entity.enums.SkinTone;

public record ClothesAndUserInfoRequest(
        // 사용자 프로필 정보
        MultipartFile userBodyImage, // 선택값
        Integer age,
        Gender gender,
        Integer height,
        Integer weight,
        SkinTone skinTone,
        // 의류 아이템 정보
        List<ClothesRequest> clothesItems
) {

}

package com.fitu.fitu.domain.clothes.dto.request;

import java.util.List;
 
import com.fitu.fitu.domain.user.dto.request.ProfileRequest;
 

public record ClothesAndUserInfoRequest(
        // 사용자 프로필 정보
        ProfileRequest userProfileInfo,
        // 의류 아이템 정보
        List<ClothesRequest> clothesItems
) {

}

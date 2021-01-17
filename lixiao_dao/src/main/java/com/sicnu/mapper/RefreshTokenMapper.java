package com.sicnu.mapper;

import com.sicnu.pojo.Refreshtoken;

public interface RefreshTokenMapper {

    int deleteAllByUserId(String clerkId);

    void insertRefreshToken(Refreshtoken refreshtoken);

    Refreshtoken findOneByTokenKey(String tokenKey);

}

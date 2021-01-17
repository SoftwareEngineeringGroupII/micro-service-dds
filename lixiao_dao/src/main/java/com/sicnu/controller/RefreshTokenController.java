package com.sicnu.controller;

import com.sicnu.mapper.RefreshTokenMapper;
import com.sicnu.pojo.Refreshtoken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/RefreshTokenMapper")
public class RefreshTokenController {
    @Resource
    private RefreshTokenMapper refreshTokenMapper;
    @PostMapping("/deleteAllByUserId")
    public int deleteAllByUserId(@RequestParam("clerkId") String clerkId){
        return refreshTokenMapper.deleteAllByUserId(clerkId);
    }
    @PostMapping("/insertRefreshToken")
    public int insertRefreshToken(@RequestParam("refreshtoken") Refreshtoken refreshtoken){
        return refreshTokenMapper.insertRefreshToken(refreshtoken);
    }
    @PostMapping("/findOneByTokenKey")
    public Refreshtoken findOneByTokenKey(@RequestParam("tokenkey") String tokenKey){
        return refreshTokenMapper.findOneByTokenKey(tokenKey);
    }
}

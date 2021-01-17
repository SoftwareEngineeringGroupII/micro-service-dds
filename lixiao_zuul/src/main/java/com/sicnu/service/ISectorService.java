package com.sicnu.service;

import com.digitaldeparturesystem.pojo.Clerk;
import com.digitaldeparturesystem.response.ResponseResult;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ISectorService extends UserDetailsService {

    /**
     * 注册
     * @param clerk
     * @param emailCode
     * @param captchaCode
     * @param captchaKey
     * @param request
     * @return
     */
    ResponseResult register(Clerk clerk, String emailCode, String captchaCode, String captchaKey, HttpServletRequest request);

    /**
     * 登录
     * @param captcha
     * @param captchaKey
     * @param clerk
     * @return
     */
    ResponseResult doLogin(String captcha, String captchaKey, Clerk clerk);

    /**
     * 检查用户是否登录，通过token验证和refreshToken验证
     * @return
     */
    Clerk checkClerk();

    /**
     * 得到处理过后的用户信息
     * @param clerkId
     * @return
     */
    ResponseResult findClerkInfo(String clerkId);

    /**
     * 通过账号查找用户
     * @param clerkAccount
     * @return
     */
    Clerk findClerkByAccount(String clerkAccount);

    /**
     * 创建一个token key返回给前端
     * @param httpServletResponse
     * @param clerk
     * @return
     */
    String createToken(HttpServletResponse httpServletResponse, Clerk clerk);

    /**
     * 获取用户所拥有的权限
     * @param clerkId
     * @return
     */
    ResponseResult getAuthoritiesByUser(String clerkId);

}

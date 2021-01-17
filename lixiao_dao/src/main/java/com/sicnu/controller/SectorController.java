package com.sicnu.controller;

import com.sicnu.mapper.SectorMapper;
import com.sicnu.pojo.Clerk;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/sectorMapper")
public class SectorController {

    @Resource
    private SectorMapper sectorMapper;


    /**
     * 通过email查找clerk
     * @param email
     * @return
     */
    @PostMapping("/findOneByEmail")
    public Clerk findOneByEmail(String email){
        return sectorMapper.findOneByEmail(email);
    }

    /**
     * 通过账号查找clerk
     * @param clerkAccount
     * @return
     */
    @PostMapping("/findOneByClerkAccount")
    public Clerk findOneByClerkAccount(String clerkAccount){
        return sectorMapper.findOneByClerkAccount(clerkAccount);
    }

    /**
     * 通过id查找clerk
     * @param clerkId
     * @return
     */
    @PostMapping("/findOneById")
    public Clerk findOneById(String clerkId){
        return sectorMapper.findOneById(clerkId);
    }

    /**
     * 修改clerk
     */
    @PostMapping("/updateClerk")
    public int updateClerk(Clerk clerk){
        return sectorMapper.updateClerk(clerk);
    }

    /**
     * 删除用户拥有的角色
     * @param map
     */
    @PostMapping("/deleteRoleToUser")
    public int deleteRoleToUser(Map<String, String> map){
        return sectorMapper.deleteRoleToUser(map);
    }

    /**
     * 更新职员密码
     * @param map
     */
    @PostMapping("/updatePassword")
    public int updatePassword(Map<String, String> map){
        return sectorMapper.updatePassword(map);
    }
}

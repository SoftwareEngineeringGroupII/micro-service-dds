package com.sicnu.controller;

import com.sicnu.mapper.UserRoleMapper;
import com.sicnu.pojo.Role;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/UserRoleMapper")
public class UserRoleController {
    @Resource
    private UserRoleMapper userRoleMapper;
    /**
     * 给用户添加角色
     *
     */
    @PostMapping("/addRoleToUser")
    public int addRoleToUser(@RequestParam("map") Map<String,String> map){
        return userRoleMapper.addRoleToUser(map);
    }

    /**
     * 删除该用户的所有角色
     * @param clerkId
     */
    @PostMapping("/deleteAllRoleByUser")
    public int deleteAllRoleByUser(@RequestParam("clerkId") String clerkId){
        return userRoleMapper.deleteAllRoleByUser(clerkId);
    }

    /**
     * 获取用户所拥有的权限
     * @param clerkId
     */
    @GetMapping("/getRolesByUser")
    public List<Role> getRolesByUser(@RequestParam("clerkId") String clerkId){
        return userRoleMapper.getRolesByUser(clerkId);
    }

    /**
     * 查询数据是否已经存在
     * @param map
     * @return
     */
    @PostMapping("/findUserRoleData")
    public String findUserRoleData(@RequestParam("map") Map<String,String> map){
        return userRoleMapper.findUserRoleData(map);
    }
}

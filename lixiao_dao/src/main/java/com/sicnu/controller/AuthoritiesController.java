package com.sicnu.controller;

import com.sicnu.mapper.AuthoritiesMapper;
import com.sicnu.pojo.Authorities;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@RestController
@RequestMapping("/authoritiesMapper")
public class AuthoritiesController {

    @Resource
    private AuthoritiesMapper authoritiesMapper;
    /**
     * 通过用户的id，得到用户拥有的权限
     * @param userId
     * @return
     */
    @PostMapping("/getRolePermissions")
    public List<Authorities> getRolePermissions(@RequestParam("userId") String userId){
        return authoritiesMapper.getRolePermissions(userId);
    }

    /**
     * 找到所有的一级权限，当parent_id不为null时为一级权限
     * @return
     */
    @GetMapping("/findByParentIsNullOrderByIndex")
    public List<Authorities> findByParentIsNullOrderByIndex(){
        return authoritiesMapper.findByParentIsNullOrderByIndex();
    }

    /**
     * 通过一级权限，找二级权限
     * @param parentId
     * @return
     */
    @PostMapping("/findChildrenByParentId")
    public List<Authorities> findChildrenByParentId(@RequestParam("parentId") String parentId){
        return authoritiesMapper.findChildrenByParentId(parentId);
    }

    /**
     * 插入权限
     * @param authorities
     */
    @PostMapping("/insertAuthority")
    public int insertAuthority(@RequestParam("authorities") Authorities authorities){
        return authoritiesMapper.insertAuthority(authorities);
    }

    /**
     * 获取全部权限
     * @return
     */
    @GetMapping("/getAllAuthorities")
    public List<Authorities> getAllAuthorities(){
        return authoritiesMapper.getAllAuthorities();
    }

    /**
     * 通过id获取权限
     * @param authorityId
     * @return
     */
    @PostMapping("/getAuthorityById")
    public Authorities getAuthorityById(@RequestParam("authorityId") String authorityId){
        return authoritiesMapper.getAuthorityById(authorityId);
    }

    /**
     * 更新权限
     * @param authority
     */
    @PostMapping("/updateAuthority")
    public int updateAuthority(@RequestParam("authority") Authorities authority){
        return authoritiesMapper.updateAuthority(authority);
    }

    /**
     * 删除权限
     * @param authorityId
     */
    @PostMapping("/deleteAuthorities")
    public int deleteAuthorities(@RequestParam("authorityId") String authorityId){
        return authoritiesMapper.deleteAuthorities(authorityId);
    }

    /**
     * 通过姓名查找权限
     * @param authorityName
     * @return
     */
    @PostMapping("/getAuthorityByName")
    public Authorities getAuthorityByName(@RequestParam("authorityName") String authorityName){
        return authoritiesMapper.getAuthorityByName(authorityName);
    }
}

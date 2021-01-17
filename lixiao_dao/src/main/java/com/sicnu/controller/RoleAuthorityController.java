package com.sicnu.controller;

import com.sicnu.mapper.RoleAuthorityMapper;
import com.sicnu.pojo.Authorities;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/RoleAuthorityMapper")
public class RoleAuthorityController {
    @Resource
    private RoleAuthorityMapper roleAuthorityMapper;
    /**
     * 向role中添加权限
     *
     */
    @PostMapping("/addAuthorityToRole")
    public int addAuthorityToRole(@RequestParam("map") Map<String,String> map){
        return roleAuthorityMapper.addAuthorityToRole(map);
    }

    /**
     * 通过roleid，获取authorities
     * @param roleId
     * @return
     */
    @PostMapping("/getAuthorityNoParentByRole")
    public List<Authorities> getAuthorityNoParentByRole(@RequestParam("roleId") String roleId){
        return roleAuthorityMapper.getAuthorityNoParentByRole(roleId);
    }

    /**
     * 通过roleid，获取authorities
     * @param roleId
     * @return
     */
    @PostMapping("/getRoleAuthorityData")
    public List<String> getRoleAuthorityData(@RequestParam("roleId") String roleId){
        return roleAuthorityMapper.getRoleAuthorityData(roleId);
    }

    /**
     * 找到子菜单
     * @return
     */
    @PostMapping("/findChildrenByParentId")
    public List<Authorities> findChildrenByParentId(@RequestParam("parentId") String parentId){
        return roleAuthorityMapper.findChildrenByParentId(parentId);
    }

    /**
     * 删除角色所拥有的权限
     * @param roleId
     */
    @PostMapping("/deleteAllAuthorityByRole")
    public int deleteAllAuthorityByRole(@RequestParam("roleId") String roleId){
        return roleAuthorityMapper.deleteAllAuthorityByRole(roleId);
    }
}

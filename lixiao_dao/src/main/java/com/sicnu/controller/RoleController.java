package com.sicnu.controller;

import com.sicnu.mapper.RoleMapper;
import com.sicnu.pojo.Role;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/RoleMapper")
public class RoleController {

    @Resource
    private RoleMapper roleMapper;
    /**
     * 添加角色
     * @param role
     */
    @PostMapping("/addRole")
    public int addRole(@RequestParam("role") Role role){
        return roleMapper.addRole(role);
    }

    /**
     * 删除角色
     * @param roleId
     */
    @PostMapping("/deleteRole")
    public int deleteRole(@RequestParam("roleId") String roleId){
        return roleMapper.deleteRole(roleId);
    }

    /**
     * 更新角色
     * @param role
     */
    @PostMapping("/updateRole")
    public int updateRole(@RequestParam("role") Role role){
        return roleMapper.updateRole(role);
    }

    /**
     * 得到全部角色
     * @return
     */
    @GetMapping("/getRoles")
    public List<Role> getRoles(){
        return roleMapper.getRoles();
    }

    /**
     * 通过角色id查找角色
     * @param roleId
     * @return
     */
    @PostMapping("/getRoleById")
    public Role getRoleById(@RequestParam("roleId") String roleId){
        return roleMapper.getRoleById(roleId);
    }

    /**
     * 通过roleName查找Role
     * @param roleName
     * @return
     */
    @PostMapping("/getRoleByName")
    public Role getRoleByName(@RequestParam("roleName") String roleName){
        return roleMapper.getRoleByName(roleName);
    }

    /**
     * 通过code获取role
     * @param roleCode
     * @return
     */
    @PostMapping("/getRoleByCode")
    public Role getRoleByCode(@RequestParam("roleCode") String roleCode){
        return roleMapper.getRoleByCode(roleCode);
    }
}

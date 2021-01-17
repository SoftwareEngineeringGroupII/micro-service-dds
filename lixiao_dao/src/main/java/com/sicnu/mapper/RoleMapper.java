package com.sicnu.mapper;

import com.sicnu.pojo.Role;

import java.util.List;

public interface RoleMapper {

    /**
     * 添加角色
     * @param role
     */
    int addRole(Role role);

    /**
     * 删除角色
     * @param roleId
     */
    int deleteRole(String roleId);

    /**
     * 更新角色
     * @param role
     */
    int updateRole(Role role);

    /**
     * 得到全部角色
     * @return
     */
    List<Role> getRoles();

    /**
     * 通过角色id查找角色
     * @param roleId
     * @return
     */
    Role getRoleById(String roleId);

    /**
     * 通过roleName查找Role
     * @param roleName
     * @return
     */
    Role getRoleByName(String roleName);

    /**
     * 通过code获取role
     * @param roleCode
     * @return
     */
    Role getRoleByCode(String roleCode);
}

package com.sicnu.client;

import com.sicnu.client.error.UserRoleError;
import com.sicnu.pojo.Authorities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(value = "lixiao-dao-8009",fallback = UserRoleError.class)
public interface RoleAuthorityClient {

    @GetMapping("/UserRoleMapper/getRolesByUser")
    List<Authorities> getAuthorityNoParentByRole(@RequestParam("roleId") String roleId);

    @PostMapping("/UserRoleMapper/findChildrenByParentId")
    List<Authorities> findChildrenByParentId(@RequestParam("parentId") String parentId);

    @PostMapping("/UserRoleMapper/getRoleAuthorityData")
    List<String> getRoleAuthorityData(@RequestParam("roleId") String roleId);

}

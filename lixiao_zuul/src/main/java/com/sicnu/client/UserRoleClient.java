package com.sicnu.client;

import com.sicnu.pojo.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(value = "lixiao-dao-8009")
public interface UserRoleClient {

    @PostMapping("/UserRoleMapper/getRolesByUser")
    List<Role> getRolesByUser(@RequestParam("clerkId") String clerkId);

}

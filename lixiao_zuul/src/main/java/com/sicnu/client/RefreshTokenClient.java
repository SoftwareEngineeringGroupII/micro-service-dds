package com.sicnu.client;

import com.sicnu.client.error.UserRoleError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "lixiao-dao-8009",fallback = UserRoleError.class)
public interface RefreshTokenClient {

    @PostMapping("/RefreshTokenMapper/deleteAllByUserId")
    int deleteAllByUserId(@RequestParam("clerkId") String clerkId);


}

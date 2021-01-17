package com.sicnu.client;

import com.sicnu.pojo.Clerk;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(value = "lixiao-dao-8009")
public interface SectorClient {

    @PostMapping("/findOneByClerkAccount")
    Clerk findOneByClerkAccount(String clerkAccount);
}

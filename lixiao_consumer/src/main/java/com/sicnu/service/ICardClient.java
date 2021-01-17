package com.sicnu.service;

import com.sicnu.response.ResponseResult;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@FeignClient("sector-card-8006")
public interface ICardClient {

      @GetMapping("/sector/card/studentId")
      public ResponseResult getCardByStudentId();


}

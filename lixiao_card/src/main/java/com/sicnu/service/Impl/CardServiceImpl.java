package com.sicnu.service.Impl;

import com.sicnu.response.ResponseResult;
import com.sicnu.service.ICardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service  //一卡通
public class CardServiceImpl implements ICardService {

    /**
     * 调用方法
     * @return
     */
    public ResponseResult getCardByStudentId(){
        return ResponseResult.SUCCESS("调用cardclient的查询学生详情方法...");
    }
}

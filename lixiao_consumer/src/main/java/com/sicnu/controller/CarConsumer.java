package com.sicnu.controller;

import com.sicnu.response.ResponseResult;
import com.sicnu.service.ICardClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CarConsumer {
/*
     * zy
     * 通过学生学号查询一卡通信息
     * @param studentId 学生学号
     * @return
     *//*
    @GetMapping("/studentId/{studentNum}")
    public ResponseResult getCardByStudentId(@PathVariable("studentNum")String studentId){
        return cardService.getStudentByIdForCard(studentId);
    }*/

    @Autowired
    private ICardClient cardClient;

    /**
     * 通过学生学号查询一卡通信息
     */
    @GetMapping("/sector/card/studentId")
    public ResponseResult getCardByStudentId(){
        return cardClient.getCardByStudentId();
    }
}

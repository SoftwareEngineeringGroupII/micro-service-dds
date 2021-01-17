package com.sicnu.controller;


import com.sicnu.response.ResponseResult;
import com.sicnu.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Card {

    @Autowired
    private ICardService cardService;

    @GetMapping("/sector/card/studentId")
    ResponseResult getCardByStudentId(){
        System.out.println("cardClient..");
        return cardService.getCardByStudentId();
    }
}

package com.sicnu.controller;

import com.sicnu.mapper.FormMapper;
import com.sicnu.pojo.Form;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/formMapper")
public class FormController {

    @Resource
    private FormMapper formMapper;

    /**
     * 展示学生离校表单
     * @param stuID
     * @return
     */
    @PostMapping("/showFormByStudent")
    public Form showFormByStudent(@RequestParam("stuID") String stuID){
        return formMapper.showFormByStudent(stuID);
    }

    @PostMapping("/showFormByStudent")
    public Form showFormByProcess(@RequestParam("stuID") String stuID){
        return formMapper.showFormByProcess(stuID);
    }

}

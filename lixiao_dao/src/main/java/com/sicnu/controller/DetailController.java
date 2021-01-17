package com.sicnu.controller;

import com.sicnu.mapper.DetailMapper;
import com.sicnu.pojo.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/detailMapper")
public class DetailController {

    @Resource
    private DetailMapper detailMapper;
    /**
     * 展示学生信息
     * @param
     */
    @PostMapping("/showDetails")
    public Student showDetails(@RequestParam("stuID") String stuID){
        return detailMapper.showDetails(stuID);
    }

}

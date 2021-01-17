package com.sicnu.controller;

import com.sicnu.mapper.ProcessMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ProcessMapper")
public class ProcessController {
    @Resource
    private ProcessMapper processMapper;
    /**
     * 获取进程审核状态
     * @param stuID
     * @return
     */
    @PostMapping("/showProcess")
    public Process showProcess(@RequestParam("stuID") String stuID){
        return processMapper.showProcess(stuID);
    }

    /**
     * 添加进程信息
     * @param process
     */
    @PostMapping("/addProcess")
    public int addProcess(@RequestParam("process") Process process){
        return processMapper.addProcess(process);
    }
}

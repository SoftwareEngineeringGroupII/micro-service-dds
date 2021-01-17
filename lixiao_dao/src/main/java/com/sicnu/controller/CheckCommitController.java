package com.sicnu.controller;

import com.sicnu.mapper.CheckCommitMapper;
import com.sicnu.pojo.Checkcommit;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CheckCommitMapper")
public class CheckCommitController {

    @Resource
    private CheckCommitMapper checkCommitMapper;

    /**
     * 提交审核
     * @param checkcommit
     * @return
     */
    @PostMapping("/addCheckCommit")
    public int addCheckCommit(@RequestParam("checkcommit") Checkcommit checkcommit){
        return checkCommitMapper.addCheckCommit(checkcommit);
    }

    /**
     * 显示已提交审核
     * @return
     */
    @PostMapping("/showCheckCommit")
    public List<Checkcommit> showCheckCommit(){
        return checkCommitMapper.showCheckCommit();
    }

    /**
     * 修改审核
     * @param checkcommit
     * @return
     */
    @PostMapping("/updateCheckCommit")
    public int updateCheckCommit(@RequestParam("checkcommit") Checkcommit checkcommit){
        return checkCommitMapper.updateCheckCommit(checkcommit);
    }

}

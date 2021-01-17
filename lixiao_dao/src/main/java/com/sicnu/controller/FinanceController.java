package com.sicnu.controller;

import com.sicnu.mapper.FinanceMapper;
import com.sicnu.pojo.FinanceInfo;
import com.sicnu.pojo.Student;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/FinanceMapper")
public class FinanceController {

    @Resource
    private FinanceMapper financeMapper;

    //根据学生学号查询财务缴费情况
    @PostMapping("/getStudentByIdForFinance")
    public FinanceInfo getStudentByIdForFinance(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.getStudentByIdForFinance(stuNumber);
    }

    //按条件分页查询学生财务缴费情况
    //List<Map<String,Object>> listStudentFinanceInfos(@Param("params")Map<String,String> params){
    @PostMapping("/listStudentFinanceInfos")
    public List<FinanceInfo> listStudentFinanceInfos(@RequestParam("params") Map<String,String> params){
        return financeMapper.listStudentFinanceInfos(params);
    }

    //根据学号审核财务状态
    @PostMapping("/doCheckForFinance")
    public int doCheckForFinance(@RequestParam("stuNum") String stuNum){
        return financeMapper.doCheckForFinance(stuNum);
    }


    //查询已经审核的财务情况
    @GetMapping("/listHadCheck")
    public List<FinanceInfo> listHadCheck(){
        return financeMapper.listHadCheck();
    }

    //查询未审核的财务情况
    //List<Map<String,Object>> listNoCheck(){
    @GetMapping("/listNoCheck")
    public List<FinanceInfo> listNoCheck(){
        return financeMapper.listNoCheck();
    }

    @GetMapping("/listAllFinance")
    public List<FinanceInfo> listAllFinance(){
        return financeMapper.listAllFinance();
    }

    //查询某个学生是否存在
    @PostMapping("/findStuByStuNumber")
    public Student findStuByStuNumber(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.findStuByStuNumber(stuNumber);
    }

    @PostMapping("/findCardStatus")
    public int findCardStatus(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.findCardStatus(stuNumber);
    }

    @PostMapping("/findDormStatus")
    public int findDormStatus(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.findDormStatus(stuNumber);
    }

    @PostMapping("/findLibStatus")
    public int findLibStatus(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.findLibStatus(stuNumber);
    }

    @PostMapping("/sumExpense")
    public int sumExpense(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.sumExpense(stuNumber);
    }

    @PostMapping("/setFine0")
    public int setFine0(@RequestParam("stuNumber") String stuNumber){
        return financeMapper.setFine0(stuNumber);
    }

}

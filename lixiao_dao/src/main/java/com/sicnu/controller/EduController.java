package com.sicnu.controller;

import com.sicnu.mapper.EduMapper;
import com.sicnu.pojo.EduInfo;
import com.sicnu.pojo.Message;
import com.sicnu.pojo.StuBasicInfo;
import com.sicnu.pojo.Student;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/EduMapper")
public class EduController {

    @Resource
    private EduMapper eduMapper;

    //查询已经提交申请信息的学生
    @GetMapping("/listPostEdu")
    public List<EduInfo>listPostEdu(){
        return eduMapper.listPostEdu();
    }

    @GetMapping("/listAllEdu")
    public List<EduInfo> listAllEdu(){
        return eduMapper.listAllEdu();
    }

    //查询没有提交申请信息的学生
    @GetMapping("/listNoPostEdu")
    public List<EduInfo>listNoPostEdu(){
        return eduMapper.listNoPostEdu();
    }

    @PostMapping("/getStudentByIdForEdu")
    public EduInfo getStudentByIdForEdu(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.getStudentByIdForEdu(stuNumber);
    }

    //设置学生的离校进度表--一卡通状态
    @PostMapping("/setCardStatus")
    public int setCardStatus(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.setCardStatus(stuNumber);
    }

    //设置学生的离校进度表--财务状态
    @PostMapping("/setFinanceStatus")
    public int setFinanceStatus(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.setFinanceStatus(stuNumber);
    }

    //设置学生的离校进度表--图书馆状态
    @PostMapping("/setLibStatus")
    public int setLibStatus(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.setLibStatus(stuNumber);
    }

    //设置学生的离校进度表--后勤状态
    @PostMapping("/setDormStatus")
    public int setDormStatus(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.setDormStatus(stuNumber);
    }

    @PostMapping("/findProcess")
    public Map<String,Object> findProcess(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.findProcess(stuNumber);
    }

    //查询某个学生是否存在
    @PostMapping("/findStuByStuNumber")
    public Student findStuByStuNumber(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.findStuByStuNumber(stuNumber);
    }

    //根据学号查询离校状态(列表)
    @PostMapping("/findStuEduByStuNumber")
    public Map<String,Object> findStuEduByStuNumber(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.findStuEduByStuNumber(stuNumber);
    }

    //根据学号查询离校审核详情
    @PostMapping("/getStuBasicInfo")
    public StuBasicInfo getStuBasicInfo(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.getStuBasicInfo(stuNumber);
    }

    @PostMapping("/getStuProcess")
    public Process getStuProcess(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.getStuProcess(stuNumber);
    }

    @GetMapping("/exportAllStuBasicInfo")
    public List<StuBasicInfo> exportAllStuBasicInfo(){
        return eduMapper.exportAllStuBasicInfo();
    }


    @PostMapping("/doEduMessage")
    public int doEduMessage(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.doEduMessage(stuNumber);
    }

    @PostMapping("/doCheckEdu")
    public int doCheckEdu(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.doCheckEdu(stuNumber);
    }

    @PostMapping("/setProcessEdu")
    public int setProcessEdu(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.setProcessEdu(stuNumber);
    }

    @PostMapping("/viewMessage")
    public Map<String,Object> viewMessage(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.viewMessage(stuNumber);
    }

    @PostMapping("/findMessage")
    public Message findMessage(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.findMessage(stuNumber);
    }

    @PostMapping("/setMessage1")
    public int setMessage1(@RequestParam("stuNumber")  String stuNumber, @RequestParam("message")  Message message){
        return eduMapper.setMessage1(stuNumber, message);
    }

    @PostMapping("/setMessage")
    public int setMessage(@RequestParam("stuNumber")  String stuNumber,@RequestParam("content")  String content,@RequestParam("title")  String title,@RequestParam("time")  Date time){
        return eduMapper.setMessage(stuNumber, content, title, time);
    }

    @PostMapping("/setStuOutDate")
    public int setStuOutDate(@RequestParam("stuNumber")  String stuNumber,@RequestParam("date")  Date date){
        return eduMapper.setStuOutDate(stuNumber,date);
    }

    @PostMapping("/findStuCredit")
    public String findStuCredit(@RequestParam("stuNumber") String stuNumber){
        return eduMapper.findStuCredit(stuNumber);
    }

    @PostMapping("/listStudentEduInfos")
    public List<EduInfo> listStudentEduInfos(@RequestParam("map")  Map<String,String> map){
        return eduMapper.listStudentEduInfos(map);
    }

}

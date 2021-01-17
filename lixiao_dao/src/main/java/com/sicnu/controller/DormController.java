package com.sicnu.controller;

import com.sicnu.mapper.DormMapper;
import com.sicnu.pojo.DormInfo;
import com.sicnu.pojo.DormPay;
import com.sicnu.pojo.Message;
import com.sicnu.pojo.Student;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DormMapper")
public class DormController {

    @Resource
    private DormMapper dormMapper;

    //按条件分页查询退寝状态
    @PostMapping("/listStudentDormInfos")
    public List<Map<String,Object>> listStudentDormInfos(@RequestParam("stuID") Map<String,String> params){
        return dormMapper.listStudentDormInfos(params);
    }

    //审核学生退寝情况
    @PostMapping("/doCheckForDorm")
    public int doCheckForDorm(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.doCheckForDorm(stuNumber);
    }

    //根据学号获取学生退寝情况
    @PostMapping("/getStudentByIdForDorm")
    public DormInfo getStudentByIdForDorm(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.getStudentByIdForDorm(stuNumber);
    }

    //导出所有学生退寝情况
    @GetMapping("/listAllDorm")
    public List<DormInfo> listAllDorm(){
        return dormMapper.listAllDorm();
    }

    //查询某个学生是否存在
    @PostMapping("/findStuByStuNumber")
    public Student findStuByStuNumber(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.findStuByStuNumber(stuNumber);
    }

    @PostMapping("/insertDormPay")
    public int insertDormPay(@RequestParam("dormPay") DormPay dormPay){
        return dormMapper.insertDormPay(dormPay);
    }

    @PostMapping("/detailDorm")
    public Map<String,Object> detailDorm(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.detailDorm(stuNumber);
    }

    @PostMapping("/updateFinanceDorm")
    public int updateFinanceDorm(@RequestParam("stuNumber")  String stuNumber, @RequestParam("total") Double total){
        return dormMapper.updateFinanceDorm(stuNumber,total);
    }

    @PostMapping("/findDormPay")
    public List<DormPay> findDormPay(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.findDormPay(stuNumber);
    }

    @PostMapping("/findSumDormpay")
    public Double findSumDormpay(@RequestParam("stuNumber") String stuNumber){
        return dormMapper.findSumDormpay(stuNumber);
    }

    @PostMapping("/sendMessage")
    public int sendMessage(@RequestParam("message") Message message){
        return dormMapper.sendMessage(message);
    }

}

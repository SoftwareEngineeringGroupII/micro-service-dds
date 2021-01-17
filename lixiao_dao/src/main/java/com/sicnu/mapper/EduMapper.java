package com.sicnu.mapper;

import com.sicnu.pojo.EduInfo;
import com.sicnu.pojo.Message;
import com.sicnu.pojo.StuBasicInfo;
import com.sicnu.pojo.Student;
import feign.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EduMapper {


    //查询所有离校状态
  //  List<Map<String,Object>> listAllEdu();

    //查询已经提交申请信息的学生
    List<EduInfo>listPostEdu();

    List<EduInfo> listAllEdu();

    //查询没有提交申请信息的学生
    List<EduInfo>listNoPostEdu();

    EduInfo getStudentByIdForEdu(String stuNumber);

    //设置学生的离校进度表--一卡通状态
    int setCardStatus(String stuNumber);

    //设置学生的离校进度表--财务状态
    int setFinanceStatus(String stuNumber);

    //设置学生的离校进度表--图书馆状态
    int setLibStatus(String stuNumber);

    //设置学生的离校进度表--后勤状态
    int setDormStatus(String stuNumber);

    Map<String,Object> findProcess(String stuNumber);

    //查询某个学生是否存在
    Student findStuByStuNumber(String stuNumber);

    //根据学号查询离校状态(列表)
    Map<String,Object> findStuEduByStuNumber(String stuNumber);

    //根据学号查询离校审核详情
   StuBasicInfo getStuBasicInfo(String stuNumber);

   Process getStuProcess(String stuNumber);

   List<StuBasicInfo> exportAllStuBasicInfo();


    int doEduMessage(String stuNumber);

    int doCheckEdu(String stuNumber);

    int setProcessEdu(String stuNumber);

    Map<String,Object> viewMessage(String stuNumber);

    Message findMessage(String stuNumber);

    int setMessage1(@Param("stuNumber") String stuNumber, @Param("message") Message message);

    int setMessage(@Param("stuNumber") String stuNumber,@Param("content") String content,@Param("title") String title,@Param("time")Date time);

    int setStuOutDate(@Param("stuNumber") String stuNumber,@Param("date") Date date);

    String findStuCredit(String stuNumber);

    List<EduInfo> listStudentEduInfos(@Param("params") Map<String,String> map);

}

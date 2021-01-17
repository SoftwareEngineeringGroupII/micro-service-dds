package com.sicnu.controller;

import com.sicnu.mapper.StudentMapper;
import com.sicnu.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/StudentMapper")
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    //找到学生，通过学生的Account
    @GetMapping("/findOneByStudentAccount")
    public Student findOneByStudentAccount(String stuNumber){
        return studentMapper.findOneByStudentAccount(stuNumber);
    }

    //获取学生列表
    @GetMapping("/getStudentList")
    public List<Student> getStudentList(){
        return studentMapper.getStudentList();
    }

    //根据学生id查询学生
    @GetMapping("/getStudentById")
    public Student getStudentById(String id){
        return studentMapper.getStudentById(id);
    }

    //修改学生信息
    @GetMapping("/updateStudent")
    public int updateStudent(Student student){
        return studentMapper.updateStudent(student);
    }

    //删除学生信息
    @GetMapping("/deleteStudent")
    public int deleteStudent(String id){
        return studentMapper.deleteStudent(id);
    }


    /**
     * 插入学生
     * @param student
     */
    @GetMapping("/insertStudent")
    public void insertStudent(Student student){
        studentMapper.insertStudent(student);
    }

    /**
     *通过邮箱查找学生
     * @param emailAddress
     * @return
     */
    @GetMapping("/findOneByEmail")
    public Student findOneByEmail(String emailAddress){
        return studentMapper.findOneByEmail(emailAddress);
    }

    /**
     * 修改学生的密码
     *
     * @return
     */
    @GetMapping("/updatePassword")
    public int updatePassword(Map<String,String> map){
        return studentMapper.updatePassword(map);
    }
}

package com.sicnu.mapper;


import com.sicnu.pojo.Student;
import feign.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    //找到学生，通过学生的Account
    Student findOneByStudentAccount(String stuNumber);

    //获取学生列表
    List<Student> getStudentList();

    //根据学生id查询学生
    Student getStudentById(String id);

    //修改学生信息
    int updateStudent(Student student);

    //删除学生信息
    int deleteStudent(String id);


    /**
     * 插入学生
     * @param student
     */
    void insertStudent(Student student);

    /**
     *通过邮箱查找学生
     * @param emailAddress
     * @return
     */
    Student findOneByEmail(String emailAddress);

    /**
     * 修改学生的密码
     *
     * @return
     */
    int updatePassword(Map<String,String> map);
}

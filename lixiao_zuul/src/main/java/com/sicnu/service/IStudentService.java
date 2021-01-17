package com.sicnu.service;

import com.sicnu.pojo.Student;
import com.sicnu.response.ResponseResult;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.http.HttpServletResponse;

public interface IStudentService extends UserDetailsService {

    /**
     * 插入学生数据
     * @param student
     * @return
     */
    ResponseResult insertStudent(Student student);

    /**
     * 检查学生登录
     * @return
     */
    Student checkStudent();

    /**
     * 创建学生Token
     * @param httpServletResponse
     * @param student
     */
    String createToken(HttpServletResponse httpServletResponse, Student student);
}

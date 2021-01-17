package com.sicnu.mapper;


import com.sicnu.pojo.Student;

public interface DetailMapper {
    /**
     * 展示学生信息
     * @param
     */
    Student showDetails(String stuID);
}

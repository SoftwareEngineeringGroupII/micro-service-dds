package com.sicnu.mapper;

import com.sicnu.pojo.Form;

public interface FormMapper {
    /**
     * 展示学生离校表单
     * @param stuID
     * @return
     */
    Form showFormByStudent(String stuID);

    Form showFormByProcess(String stuID);

}

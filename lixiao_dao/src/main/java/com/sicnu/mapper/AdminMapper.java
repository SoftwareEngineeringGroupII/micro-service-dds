package com.sicnu.mapper;

import com.sicnu.pojo.Clerk;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

public interface AdminMapper {

    /**
     * 添加Clerk
     * @param clerk
     * @return
     */
    void addClerk(Clerk clerk);

    /**
     * 查找所有的clerk
     * @return
     */
    List<Clerk> findAllClerks();


    /**
     * 删除clerk
     * @param clerkId
     */
    void deleteClerk(String clerkId);


}

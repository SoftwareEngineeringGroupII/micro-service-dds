package com.sicnu.mapper;

import com.sicnu.pojo.Clerk;

import java.util.List;

public interface AdminMapper {

    /**
     * 添加Clerk
     * @param clerk
     * @return
     */
    int addClerk(Clerk clerk);

    /**
     * 查找所有的clerk
     * @return
     */
    List<Clerk> findAllClerks();


    /**
     * 删除clerk
     * @param clerkId
     */
    int deleteClerk(String clerkId);


}

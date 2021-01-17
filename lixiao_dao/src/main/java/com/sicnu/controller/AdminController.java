package com.sicnu.controller;

import com.sicnu.mapper.AdminMapper;
import com.sicnu.pojo.Clerk;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentMapper")
public class AdminController {

    private AdminMapper adminMapper;
    /**
     * 添加Clerk
     * @param clerk
     * @return
     */
    @PostMapping("/addClerk")
    public int addClerk(Clerk clerk){
        return adminMapper.addClerk(clerk);
    }

    /**
     * 查找所有的clerk
     * @return
     */
    @GetMapping("/findAllClerks")
    public List<Clerk> findAllClerks(){
        return adminMapper.findAllClerks();
    }


    /**
     * 删除clerk
     * @param clerkId
     */
    @PostMapping("/deleteClerk")
    public int deleteClerk(String clerkId){
        return adminMapper.deleteClerk(clerkId);
    }
}

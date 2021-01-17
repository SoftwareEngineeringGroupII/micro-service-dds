package com.sicnu.controller;

import com.sicnu.mapper.AdminMapper;
import com.sicnu.pojo.Clerk;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/adminMapper")
public class AdminController {

    @Resource
    private AdminMapper adminMapper;
    /**
     * 添加Clerk
     * @param clerk
     * @return
     */
    @PostMapping("/addClerk")
    public int addClerk(@RequestParam("clerk") Clerk clerk){
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
    public int deleteClerk(@RequestParam("clerkId") String clerkId){
        return adminMapper.deleteClerk(clerkId);
    }
}

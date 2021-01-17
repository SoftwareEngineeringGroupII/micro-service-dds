package com.sicnu.controller;

import com.sicnu.mapper.NoticeMapper;
import com.sicnu.pojo.Notice;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/NoticeMapper")
public class NoticeController {
    @Resource
    private NoticeMapper noticeMapper;
    @PostMapping("/save")
    public int save(@RequestParam("notice")Notice notice){
        return noticeMapper.save(notice);
    }
    @PostMapping("/deleteNotice")
    public int deleteNotice(@RequestParam("noticeID")String noticeID){
        return noticeMapper.deleteNotice(noticeID);
    }
    @PostMapping("/findSelfNotice")
    public List<Notice> findSelfNotice(@RequestParam("ClerkId") String ClerkId){
        return noticeMapper.findSelfNotice(ClerkId);
    }
    @PostMapping("/findSelfNotice2")
    public List<Notice> findSelfNotice2(@RequestParam("ClerkId") String ClerkId){
        return noticeMapper.findSelfNotice2(ClerkId);
    }
    @PostMapping("/findSelfNotice1")
    public List<Notice> findSelfNotice1(@RequestParam("ClerkId") String ClerkId){
        return noticeMapper.findSelfNotice1(ClerkId);
    }
    @PostMapping("/findSelfNotice3")
    public List<Notice> findSelfNotice3(@RequestParam("ClerkId") String ClerkId){
        return noticeMapper.findSelfNotice3(ClerkId);
    }
    @PostMapping("/findSelfNotice0")
    public List<Notice> findSelfNotice0(@RequestParam("ClerkId") String ClerkId){
        return noticeMapper.findSelfNotice0(ClerkId);
    }
    @PostMapping("/setNoticePass")
    public int setNoticePass(@RequestParam("noticeID") String noticeID){
        return noticeMapper.setNoticePass(noticeID);
    }
    @PostMapping("/setNoticeRefuse")
    public int setNoticeRefuse(@RequestParam("noticeID") String noticeID){
        return noticeMapper.setNoticeRefuse(noticeID);
    }
    @GetMapping("/viewAllByPeople")
    public List<Notice> viewAllByPeople(){
        return noticeMapper.viewAllByPeople();
    }
    @PostMapping("/viewNoticeDetails")
    public Notice viewNoticeDetails(@RequestParam("noticeID") String noticeID){
        return noticeMapper.viewNoticeDetails(noticeID);
    }
    @GetMapping("/NoCheckNotice")
    public List<Notice> NoCheckNotice(){
        return noticeMapper.NoCheckNotice();
    }
    @GetMapping("/listAllNotice")
    public List<Notice> listAllNotice(){
        return noticeMapper.listAllNotice();
    }
    @GetMapping("/haveCheckNotice")
    public  List<Notice> haveCheckNotice(){
        return noticeMapper.haveCheckNotice();
    }
    @GetMapping("/RefuseNotice")
    public  List<Notice> RefuseNotice(){
        return noticeMapper.RefuseNotice();
    }
    @GetMapping("/draftNotice")
    public List<Notice> draftNotice(){
        return noticeMapper.draftNotice();
    }
    @PostMapping("/setTop")
    public int setTop(@RequestParam("noticeID") String noticeID){
        return noticeMapper.setTop(noticeID);
    }
    @PostMapping("/setUnTop")
    public int setUnTop(@RequestParam("noticeID") String noticeID){
        return noticeMapper.setUnTop(noticeID);
    }
    @GetMapping("/viewTopNotice")
    public List<Notice> viewTopNotice(){
        return noticeMapper.viewTopNotice();
    }
    @GetMapping("/viewUnTopNotice")
    public List<Notice> viewUnTopNotice(){
        return noticeMapper.viewUnTopNotice();
    }
    @PostMapping("/searchNotice")
    public  List<Notice>  searchNotice(@RequestParam("department") String department){
        return noticeMapper.searchNotice(department);
    }
    @PostMapping("/searchNotice0")
    public List<Notice> searchNotice0(@RequestParam("apartment") String apartment){
        return noticeMapper.searchNotice0(apartment);
    }
    @PostMapping("/searchNotice2")
    public List<Notice> searchNotice2(@RequestParam("apartment") String apartment){
        return noticeMapper.searchNotice2(apartment);
    }
    @PostMapping("/searchNotice1")
    public List<Notice> searchNotice1(@RequestParam("apartment") String apartment){
        return noticeMapper.searchNotice1(apartment);
    }
    @PostMapping("/listByDepartment")
    public List<Notice> listByDepartment(@RequestParam("apartment") String apartment){
        return noticeMapper.listByDepartment(apartment);
    }
    @PostMapping("/searchNoticeByTitle")
    public List<Notice> searchNoticeByTitle(@Param("department") @RequestParam("department") String department, @Param("title") @RequestParam("title") String title){
        return noticeMapper.searchNoticeByTitle(department,title);
    }
    @PostMapping("/listSelfNotice")
    public List<Notice> listSelfNotice(@RequestParam("apartment") String apartment){
        return noticeMapper.listSelfNotice(apartment);
    }
}

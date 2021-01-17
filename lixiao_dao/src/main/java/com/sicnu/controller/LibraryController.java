package com.sicnu.controller;

import com.sicnu.mapper.LibraryMapper;
import com.sicnu.pojo.Book;
import com.sicnu.pojo.LibInfo;
import com.sicnu.pojo.Message;
import com.sicnu.pojo.Student;
import feign.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/LibraryMapper")
public class LibraryController {

    @Resource
    private LibraryMapper libraryMapper;

    //查询所有图书借书信息
    @GetMapping("/listAllLibrary")
    public List<LibInfo> listAllLibrary(){
        return libraryMapper.listAllLibrary();
    }

    @PostMapping("/listStudentLibInfos")
    public List<LibInfo> listStudentLibInfos(@RequestParam("params") Map<String,String> params){
        return libraryMapper.listStudentLibInfos(params);
    }

    @PostMapping("/findStuLibrary")
    public LibInfo findStuLibrary(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.findStuLibrary(stuNumber);
    }

    @PostMapping("/bookDetail")
    public List<Map<String,Object>> bookDetail(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.bookDetail(stuNumber);
    }

    @PostMapping("/checkLibrary")
    public int checkLibrary(@RequestParam("stuNumber") String stuNumber, @RequestParam("bookId") String bookId){
        return libraryMapper.checkLibrary(stuNumber, bookId);
    }

    @PostMapping("/needReturn")
    public int needReturn(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.needReturn(stuNumber);
    }

    @PostMapping("/changeStatus")
    public int changeStatus(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.changeStatus(stuNumber);
    }

    @PostMapping("/findPaper")
    public String findPaper(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.findPaper(stuNumber);
    }

    //查询某个学生是否存在
    @PostMapping("/findStuByStuNumber")
    public Student findStuByStuNumber(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.findStuByStuNumber(stuNumber);
    }

    @PostMapping("/updateBookPay")
    public int updateBookPay(@RequestParam("zhe") Double zhe,@RequestParam("bookId") String bookId){
        return libraryMapper.updateBookPay(zhe,bookId);
    }

    @PostMapping("/updateFinanceBook")
    public int updateFinanceBook(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.updateFinanceBook(stuNumber);
    }

    @PostMapping("/sumPayForLib")
    public Double sumPayForLib(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.sumPayForLib(stuNumber);
    }

    @PostMapping("/sumPayBook")
    public List<Book> sumPayBook(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.sumPayBook(stuNumber);
    }

    @PostMapping("/sendMessageByLib")
    public int sendMessageByLib(@RequestParam("message") Message message){
        return libraryMapper.sendMessageByLib(message);
    }

    @PostMapping("/findStuIDByNumber")
    public String findStuIDByNumber(@RequestParam("stuNumber") String stuNumber){
        return libraryMapper.findStuIDByNumber(stuNumber);
    }

    @PostMapping("/detailBook")
    public Map<String,Object> detailBook(@RequestParam("bookID") String bookID){
        return libraryMapper.detailBook(bookID);
    }

}

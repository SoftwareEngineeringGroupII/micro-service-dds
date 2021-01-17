package com.sicnu.mapper;

import com.sicnu.pojo.Book;
import com.sicnu.pojo.LibInfo;
import com.sicnu.pojo.Message;
import com.sicnu.pojo.Student;
import feign.Param;

import java.util.List;
import java.util.Map;

public interface LibraryMapper {


    //查询所有图书借书信息
    List<LibInfo> listAllLibrary();

    List<LibInfo> listStudentLibInfos(@Param("params")Map<String,String> params);

    LibInfo findStuLibrary(String stuNumber);

    List<Map<String,Object>> bookDetail(String stuNumber);

    int checkLibrary(@Param("stuNumber") String stuNumber, @Param("bookId") String bookId);

    int needReturn(String stuNumber);

    int changeStatus(String stuNumber);

    String findPaper(String stuNumber);

    //查询某个学生是否存在
    Student findStuByStuNumber(String stuNumber);

    int updateBookPay(@Param("zhe")Double zhe,@Param("bookId")String bookId);

    int updateFinanceBook(String stuNumber);

    Double sumPayForLib(String stuNumber);

    List<Book> sumPayBook(String stuNumber);

    int sendMessageByLib(Message message);

    String findStuIDByNumber(String stuNumber);

    Map<String,Object> detailBook(String bookID);
}

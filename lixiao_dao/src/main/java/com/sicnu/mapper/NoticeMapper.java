package com.sicnu.mapper;


import com.sicnu.pojo.Notice;
import feign.Param;

import java.util.List;

public interface NoticeMapper {

    void save(Notice notice);

    void deleteNotice(String noticeID);

    List<Notice> findSelfNotice(String ClerkId);

    List<Notice> findSelfNotice2(String ClerkId);

    List<Notice> findSelfNotice1(String ClerkId);

    List<Notice> findSelfNotice3(String ClerkId);

    List<Notice> findSelfNotice0(String ClerkId);

    void setNoticePass(String noticeID);

    void setNoticeRefuse(String noticeID);

    List<Notice> viewAllByPeople();

    Notice viewNoticeDetails(String noticeID);

    List<Notice> NoCheckNotice();

    List<Notice> listAllNotice();

    List<Notice> haveCheckNotice();

    List<Notice> RefuseNotice();

    List<Notice> draftNotice();

    void setTop(String noticeID);

    void setUnTop(String noticeID);

    List<Notice> viewTopNotice();

    List<Notice> viewUnTopNotice();

    List<Notice>  searchNotice(String department);

    List<Notice> searchNotice0(String apartment);

    List<Notice> searchNotice2(String apartment);

    List<Notice> searchNotice1(String apartment);

    List<Notice> listByDepartment(String apartment);

    List<Notice> searchNoticeByTitle(@Param("department") String department, @Param("title") String title);

    List<Notice> listSelfNotice(String apartment);



}

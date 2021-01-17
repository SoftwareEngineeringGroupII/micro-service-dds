package com.sicnu.mapper;

import com.sicnu.pojo.Checkcommit;

import java.util.List;

public interface CheckCommitMapper {
    /**
     * 提交审核
     * @param checkcommit
     * @return
     */
    int addCheckCommit(Checkcommit checkcommit);

    /**
     * 显示已提交审核
     * @return
     */
    List<Checkcommit> showCheckCommit();

    /**
     * 修改审核
     * @param checkcommit
     * @return
     */
    int updateCheckCommit(Checkcommit checkcommit);
}

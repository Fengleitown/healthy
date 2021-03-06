package com.IT.liuJia.dao;

import com.IT.liuJia.pojo.Member;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MemberDao {
    public List<Member> findAll();
    public Page<Member> selectByCondition(String queryString);
    public void add(Member member);
    public void deleteById(Integer id);
    public Member findById(Integer id);
    public Member findByTelephone(String telephone);
    public void edit(Member member);
    public Integer findMemberCountBeforeDate(String date);
    public Integer findMemberCountByDate(String date);
    public Integer findMemberCountAfterDate(String date);
    public Integer findMemberTotalCount();
	public Integer findMemberCountMonthDate(@Param("strFromDate")String strFromDate, @Param("strToDate") String strToDate);
    List<Map<String,String>> findMemberOfGender();
    Map<String,Integer> findStageCount();
}

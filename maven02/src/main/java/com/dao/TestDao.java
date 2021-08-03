package com.dao;

import com.entity.StudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    public List<StudentInfo> queryAll();
}

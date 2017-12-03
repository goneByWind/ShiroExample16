package com.lanou.service;

import com.lanou.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 17/10/16.
 */
public interface StudentService {

    // 找到所有学生
    List<Student> findAllStudents();

}

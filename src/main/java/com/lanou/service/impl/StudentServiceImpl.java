package com.lanou.service.impl;

import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/10/16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Student> findAllStudents() {

        return studentMapper.findAll();
    }
}

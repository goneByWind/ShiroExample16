package com.lanou.controller;

import com.lanou.bean.Student;
import com.lanou.mapper.StudentMapper;
import com.lanou.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/10/16.
 */
@Controller
public class MainController {

    // 2.配置好SSM-mybatis.xml web.xml之后的测试
    @Resource
    private StudentMapper studentMapper;

    // 3.加入service层
    @Resource
    private StudentService studentService;


    // 1.配置好SSM-servlet.xml web.xml之后的测试
    @RequestMapping(value = "/homepage")
    public String frontPage(){

        // 2之后加的
        Student student = studentMapper.selectByPrimaryKey(1);
        System.out.println(student);
        return "home";
    }

    // 返回ajax->json的参数到网页
    @ResponseBody
    @RequestMapping(value = "/findall")
    public List<Student> findAllStudents(){

        // 3加入后
        return studentService.findAllStudents();
    }
}

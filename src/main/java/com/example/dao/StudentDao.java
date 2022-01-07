package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.StudentContext;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<StudentContext> {
        /*public List<Student> queryAllStudents();
        public Integer addStudent(Student student);
        public List<Map<String,String>>getSpecial(@Param("strings")List<String> strings, Integer flag);*/
}

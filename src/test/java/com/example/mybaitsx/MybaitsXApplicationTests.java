package com.example.mybaitsx;

import com.example.dao.StudentDao;
import com.example.entity.StudentContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybaitsXApplicationTests {
    @Autowired
    StudentDao studentDao;
    @Test
    void contextLoads() {
        List<StudentContext> studentContexts = studentDao.selectList(null);
        System.out.println(studentContexts);

    }
}

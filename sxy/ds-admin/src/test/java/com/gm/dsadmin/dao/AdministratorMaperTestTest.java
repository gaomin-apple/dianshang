package com.gm.dsadmin.dao;

import com.gm.dsadmin.po.Administrator;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.*;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AdministratorMaperTestTest {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Test
    void selectByUsername() {
        String username = "admin";
        Administrator administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);

    }
}
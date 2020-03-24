package com.gm.dscustomer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.gm.dscustomer.dao")
@EnableCaching
@EnableScheduling
public class DsCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsCustomerApplication.class, args);
    }

}

package com.gm.dscustomer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gm.dscustomer.dao")
public class DsCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsCustomerApplication.class, args);
	}

}

package com.gm.dsadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gm.dsadmin.dao")
public class DsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsAdminApplication.class, args);
	}

}

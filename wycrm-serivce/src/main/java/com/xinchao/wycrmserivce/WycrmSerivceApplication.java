package com.xinchao.wycrmserivce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xinchao.wycrmserivce.project.mapper")
@SpringBootApplication
public class WycrmSerivceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WycrmSerivceApplication.class, args);
	}
}

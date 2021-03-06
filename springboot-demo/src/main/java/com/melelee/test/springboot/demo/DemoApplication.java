package com.melelee.test.springboot.demo;

import com.didispace.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
@EnableSwagger2Doc
@SpringBootApplication
@MapperScan(basePackages = "com.melelee.test.springboot.demo.mapper")//将项目中对应的mapper类的路径加进来就可以了
@EnableScheduling
@EnableAsync
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate newRestTemplate(){
		return new RestTemplate();
	}
}

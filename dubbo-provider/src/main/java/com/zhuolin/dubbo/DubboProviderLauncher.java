package com.zhuolin.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;


@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderLauncher {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DubboProviderLauncher.class, args);
	}
}

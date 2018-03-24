package com.nyvi.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;


@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DubboConsumerLauncher.class, args);
	}
}

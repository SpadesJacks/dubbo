package com.nyvi.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) {
		System.out.println(name);
		return "Hello " + name + " !";
	}

}

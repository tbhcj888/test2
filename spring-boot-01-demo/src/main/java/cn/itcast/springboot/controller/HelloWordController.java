package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.properties.ItcastProperties;

@RestController
public class HelloWordController {
	@Autowired
	private Environment environment;
	@Value("${itheima.name}")
	private String itheimaName;
	@Value("${itheima.name2}")
	private String itheimaName2;
	@Value("${itheima.url}")
	private String itheimaurl;
	
	@Autowired
	private ItcastProperties itcastProperties;
	
	@RequestMapping("/test")
	public String sayHello() {
/*		System.out.println("第一种方式0:"+environment.getProperty("itheima0"));
		System.out.println("第一种方式A:"+environment.getProperty("itheima"));
		System.out.println("第一种方式B:"+environment.getProperty("itheima.url"));
		System.out.println("第二种方式0:"+itheima0);
		System.out.println("第二种方式A:"+itheima);
		System.out.println("第二方式B:"+itheimaurl);*/
		System.out.println("第三方式a:"+itcastProperties.getName());
		System.out.println("第三方式a:"+itcastProperties.getUrl());
		return "Hello Wolrd!";
	}

}

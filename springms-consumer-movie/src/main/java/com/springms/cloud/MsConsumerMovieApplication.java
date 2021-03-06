package com.springms.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 电影微服务，也注册到 EurekaServer 中，通过 Http 协议访问已注册到生态圈中的用户微服务。
 *
 * @author hmilyylimh
 *
 * @version 0.0.1
 *
 * @date 2017/9/17
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MsConsumerMovieApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MsConsumerMovieApplication.class, args);
		System.out.println("【【【【【【 电影微服务 】】】】】】已启动.");
	}
}

/****************************************************************************************
 一、电影微服务，也注册到 EurekaServer 中，通过 Http 协议访问已注册到生态圈中的用户微服务：

 1、启动 springms-discovery-eureka 模块服务，启动1个端口；
 2、启动 springms-provider-user 模块服务，启动1个端口；
 3、启动 springms-consumer-movie 模块服务，启动1个端口；
 4、在浏览器输入地址 http://localhost:7900/simple/1 可以看到信息成功的被打印出来，说明用户微服务正常；
 5、在浏览器输入地址 http://localhost:8761 并输入用户名密码 admin/admin 进入Eureka微服务显示在网页中，验证用户微服务、电影微服务确实注册到了 eureka 服务中；

 6、在浏览器输入地址http://localhost:7901/movie/1 可以看到用户信息成功的被打印出来；
 ****************************************************************************************/




package com.richiecodes.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;

import java.net.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		RestService rs = new RestService(new RestTemplateBuilder());
		System.out.println(rs.getPostsPlainJSON());
		rs.createPost(100, "test", "this is a test by richard");
		cls();
		System.out.println(rs.getPostsPlainJSON());
	}

	public static void cls() {
		int i = 100;
		while(i > 0) {
			System.out.println();
			i--;
		}
	}

}

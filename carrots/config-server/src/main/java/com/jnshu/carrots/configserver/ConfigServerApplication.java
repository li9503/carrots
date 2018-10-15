package com.jnshu.carrots.configserver;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}


	/**
	 * 远程 git webhooks ，调用此接口，由此接口发起 http post 请求去
	 * 触发bus-refresh 接口，通过 rabbitmq 等一系列 默认处理机制就可以实现动态刷新机制
	 *
	 * @throws IOException
	 */
	@PostMapping("postRefresh")
	public void httpPostJSON() throws IOException {
		// 模拟 http 请求
		HttpClient httpClient = HttpClientBuilder.create().build();
//        DefaultHttpClient httpClient = new DefaultHttpClient();
		String url = "http://localhost:8091/actuator/bus-refresh";
		HttpPost httpPost = new HttpPost(url);
		// 设置请求的header
		httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
		// 执行请求
		HttpResponse response = httpClient.execute(httpPost);
	}
}

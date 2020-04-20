package cn.sz.lh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReportProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportProviderApplication.class, args);
	}
}

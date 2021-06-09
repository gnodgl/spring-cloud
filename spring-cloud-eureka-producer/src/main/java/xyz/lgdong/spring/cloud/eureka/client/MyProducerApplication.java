package xyz.lgdong.spring.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProducerApplication.class, args);
    }

}

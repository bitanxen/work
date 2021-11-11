package com.dbs.itt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.dbs.itt", "com.dbs.itt.proxy"})
public class TradaAutoresponderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradaAutoresponderServiceApplication.class, args);
    }

}

package cn.lzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author luoyong
 * @date 2018-11-25下午 8:04
 */
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixDashBordApplication {

    public static void main(String[] args) {

        SpringApplication.run(HystrixDashBordApplication.class,args);
    }
}

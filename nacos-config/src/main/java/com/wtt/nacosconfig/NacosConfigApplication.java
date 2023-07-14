package com.wtt.nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.TimeUnit;

@ComponentScan("com.wtt")
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
//        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(NacosConfigApplication.class, args);
//        while (true) {
//            String userName = configurableApplicationContext.getEnvironment().getProperty("user.name");
//            String userAge = configurableApplicationContext.getEnvironment().getProperty("user.age");
//            System.out.println("userName:" + userName + " userAge:" + userAge);
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

}

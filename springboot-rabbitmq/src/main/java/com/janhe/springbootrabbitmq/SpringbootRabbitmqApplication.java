package com.janhe.springbootrabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.RabbitAutoConfiguration 自动化配置类
 * 2.ConnectionFactory 自动化连接工厂
 * 3.配置文件 RabbitProperties
 * 4.RabbitTemplate  消息操作类
 */
@EnableRabbit //开启rabbit注解
@SpringBootApplication
public class SpringbootRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitmqApplication.class, args);
    }

}

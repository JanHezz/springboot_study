package com.janhe.springbootrabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


/**
 * 1.RabbitAutoConfiguration 自动化配置类
 * 2.ConnectionFactory 自动化连接工厂
 * 3.配置文件 RabbitProperties
 * 4.RabbitTemplate  消息操作类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

    @Autowired
    RabbitTemplate  rabbitTemplate;
    /**
     * 测试点对点
     */
    @Test
    public void testDirect() {


        /**
         * String exchange, 交换机
         * String routingKey,  路由键
         * final Object object 内容实体
         *
         */
        rabbitTemplate.convertAndSend("janhe.direct","janhe.news","dasd1");

    }


    /**
     * 测试广播
     * 所有绑定了这个交互机的都能收到
     */
    @Test
    public void testFanout() {

        Map<String,Object> data=new HashMap<>();
        data.put("dad",123);
        data.put("da",1455);
        /**
         * String exchange, 交换机
         * String routingKey,  路由键
         * final Object object 内容实体
         *
         */
        rabbitTemplate.convertAndSend("janhe.fanout","janhe.news",data);

    }


    /**
     * 测试通知
     * 符合路由键规则的能收到
     */
    @Test
    public void testTopic() {


        /**
         * String exchange, 交换机
         * String routingKey,  路由键
         * final Object object 内容实体
         *
         */
        rabbitTemplate.convertAndSend("janhe.topic","janhe.news","dasd1");

    }

    @Test
    public void recieveDirect() {
        /**
         *
         * queueName 队列名
         *
         *
         */
        Object o = rabbitTemplate.receiveAndConvert("janhe.news");
        System.out.println(o.toString());


    }



}

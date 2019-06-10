package com.janhe.springbootrabbitmq.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @CLASSNAME RabbitListener
 * @Description
 * @Auther Jan  何康宁
 * @DATE 2019/6/2 0002 17:07
 */
@Component
public class MyRabbitListener {

    @Autowired
    RabbitTemplate rabbitTemplate;


    @RabbitListener(queues = "janhe.news")
    public void recieve(Object obj)
    {
        System.out.println("收到消息  = [" + obj + "]");
    }

}

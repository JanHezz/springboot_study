package com.janhe.springbootrabbitmq.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @CLASSNAME RabbitConfiguation
 * @Description
 * @Auther Jan  何康宁
 * @DATE 2019/6/2 0002 16:57
 */

@Configuration
public class RabbitConfiguation {


    @Bean
    public MessageConverter messageConverter()
    {
return  new Jackson2JsonMessageConverter();
    }
}

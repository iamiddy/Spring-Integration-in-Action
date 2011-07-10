package com.manning.siia.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author Marius Bogoevici
 */
public class HelloWorldExample {

    public static void main(String args[]) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        MessageChannel channel = context.getBean("names", MessageChannel.class);
        Message<String> message = MessageBuilder.withPayload("World").build();
        channel.send(message);
    }
}

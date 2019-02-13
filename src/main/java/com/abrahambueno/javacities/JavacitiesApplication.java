package com.abrahambueno.javacities;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavacitiesApplication {

    public static final String EXCHANGE_NAME = "LambdaServer";
//    One for secret messages - ALL secret messages go to this queue
//    One for cities (cities1)
//    Another for cities (cities2)
    public static final String QUEUE_SECRET_MESSAGES = "SecretMessagesQueue";
    public static final String QUEUE_CITIES_ONE = "CitiesOnePriorityQueue";
    public static final String QUEUE_CITIES_TWO = "CitiesTwoPriorityQueue";

    public static void main(String[] args) {
        SpringApplication.run(JavacitiesApplication.class, args);
    }

    @Bean
    public TopicExchange appExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue appQueueOne() {
        return new Queue(QUEUE_CITIES_ONE);
    }
    @Bean
    public Binding declareBindingOne() {
        return BindingBuilder.bind(appQueueOne()).to(appExchange()).with(QUEUE_CITIES_ONE);
    }

    @Bean
    public Queue appQueueTwo() {
        return new Queue(QUEUE_CITIES_TWO);
    }
    @Bean
    public Binding declareBindingTwo() {
        return BindingBuilder.bind(appQueueTwo()).to(appExchange()).with(QUEUE_CITIES_TWO);
    }

    @Bean
    public Queue appQueueMessages() {
        return new Queue(QUEUE_SECRET_MESSAGES);
    }
    @Bean
    public Binding declareBindingMessages() {
        return BindingBuilder.bind(appQueueMessages()).to(appExchange()).with(QUEUE_SECRET_MESSAGES);
    }


}


package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CitiesMessageListener {
    @RabbitListener(queues = JavacitiesApplication.QUEUE_SECRET_MESSAGES)
    public void receiveSecretMessage(CitiesMessage cm) {
        log.info("Received SECRET Message: {} " + cm.toString());
    }

    @RabbitListener(queues = JavacitiesApplication.QUEUE_CITIES_ONE)
    public void receiveMessageOne(CitiesMessage cm) {
        log.info("Received CITY ONE Message: {} " + cm.toString());
    }

    @RabbitListener(queues = JavacitiesApplication.QUEUE_CITIES_TWO)
    public void receiveMessageTwo(CitiesMessage cm) {
        log.info("Received CITY TWO Message: {} " + cm.toString());
    }
}

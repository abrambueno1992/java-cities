package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CitiesMessageListener {
    @RabbitListener(queues = JavacitiesApplication.QUEUE_SECRET_MESSAGES)
    public void receiveMessage(CitiesMessage cm) {
        log.info("Received Message: {} " + cm.toString());
    }
}

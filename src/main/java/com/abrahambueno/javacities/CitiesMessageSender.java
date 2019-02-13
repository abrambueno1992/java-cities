package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Slf4j
@Service
public class CitiesMessageSender {
    private final RabbitTemplate ct;
    private final CitiesRepository citiesrepos;

    public CitiesMessageSender(RabbitTemplate ct, CitiesRepository citiesrepos) {
        this.ct = ct;
        this.citiesrepos = citiesrepos;
    }

    @Scheduled(fixedDelay = 3000L)
    public void sendMessage() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.addAll(citiesrepos.findAll());

        for (Cities c : cities) {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final CitiesMessage message = new CitiesMessage(c.toString(), rand, randBool);
            if (randBool) {
                log.info("Sending secret message ");
                ct.convertAndSend(JavacitiesApplication.QUEUE_SECRET_MESSAGES, message);
            } else {
                log.info("Sending cities 1");
                ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_ONE, message);
            }
        }
    }

}

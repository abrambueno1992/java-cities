package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
@Slf4j
@RequestMapping("/cities")
public class CitiesController {
    private final CitiesRepository citiesrepos;
    private final RabbitTemplate ct;

    public CitiesController(CitiesRepository citiesrepos, RabbitTemplate ct) {
        this.citiesrepos = citiesrepos;
        this.ct = ct;
    }

    @GetMapping("/afford")
    public void feedDataByIndex() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.addAll(citiesrepos.findAll());
        ArrayList<CitiesMessage> secretMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityOneMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityTwoMessages = new ArrayList<CitiesMessage>();

        for (Cities c : cities) {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final CitiesMessage message = new CitiesMessage(c.toString(), rand, randBool);
            if (randBool) {
                secretMessages.add(message);
            } else if (c.getAffordableIndex() < 6) {
                cityOneMessages.add(message);
            } else {
                cityTwoMessages.add(message);
            }

        }

        for (CitiesMessage s : secretMessages) {
            log.info("Sending secret message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_SECRET_MESSAGES, s);
        }
        for (CitiesMessage one : cityOneMessages) {
            log.info("Sending cities1 message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_ONE, one);
        }

        for (CitiesMessage two : cityTwoMessages) {
            log.info("Sending cities2 message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_TWO, two);
        }

    }

//
    @GetMapping("/homes")
    public void getDataByHomePrice() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.addAll(citiesrepos.findAll());
        ArrayList<CitiesMessage> secretMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityOneMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityTwoMessages = new ArrayList<CitiesMessage>();

        for (Cities c : cities) {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final CitiesMessage message = new CitiesMessage(c.toString(), rand, randBool);
            if (randBool) {
                secretMessages.add(message);
            } else if (c.getHomePrice() > 200000) {
                cityOneMessages.add(message);
            } else {
                cityTwoMessages.add(message);
            }

        }

        for (CitiesMessage s : secretMessages) {
            log.info("Sending secret message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_SECRET_MESSAGES, s);
        }
        for (CitiesMessage one : cityOneMessages) {
            log.info("Sending cities1 message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_ONE, one);
        }

        for (CitiesMessage two : cityTwoMessages) {
            log.info("Sending cities2 message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_TWO, two);
        }
    }
//
    @GetMapping("/name")
    public void getDataNoCriteria() {
        ArrayList<Cities> cities = new ArrayList<Cities>();
        cities.addAll(citiesrepos.findAll());
        ArrayList<CitiesMessage> secretMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityOneMessages = new ArrayList<CitiesMessage>();
        ArrayList<CitiesMessage> cityTwoMessages = new ArrayList<CitiesMessage>();

        for (Cities c : cities) {
            int rand = new Random().nextInt(10);
            boolean randBool = new Random().nextBoolean();
            final CitiesMessage message = new CitiesMessage(c.toString(), rand, randBool);
            if (randBool) {
                secretMessages.add(message);
            }  else {
                cityOneMessages.add(message);
            }

        }

        for (CitiesMessage s : secretMessages) {
            log.info("Sending secret message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_SECRET_MESSAGES, s);
        }
        for (CitiesMessage one : cityOneMessages) {
            log.info("Sending cities1 message ");
            ct.convertAndSend(JavacitiesApplication.QUEUE_CITIES_ONE, one);
        }

    }
}

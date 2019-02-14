package com.abrahambueno.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/homes")

    @GetMapping("/name")
}

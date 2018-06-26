package com.in28minutes.microservices.limitsservice;

import com.in28minutes.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitConfigurationController {

    @GetMapping
    public LimitConfiguration retrieveLimitsFromConfiguration() {
	return new LimitConfiguration(1000, 1);
    }

}

package com.arv.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arv.limitsservice.configuration.Configuration;
import com.arv.limitsservice.model.LimitsConfiguration;

@RestController
public class LimitsServiceController {

	private final Configuration config;
	
	public LimitsServiceController(Configuration config) {
		this.config = config;
	}
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsConfig() {
		
		return new LimitsConfiguration(config.getMinimum(), config.getMaximum());
	}
}

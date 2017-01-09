package com.example.springboot.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.bean.Greeting;

@RestController
public class GreetingController {

	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	private static final String template = "Hello, %s!";

	@Value("${spring.profiles.active}")
	private String activeProfile;

	private final AtomicLong counter = new AtomicLong();

	@Profile(value = "foo")
	@RequestMapping("/foo/greeting")
	public Greeting fooGreeting(@RequestParam(value = "name", defaultValue = "Foo World") String name) {
		logger.debug("activeProfile=" + activeProfile);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@Profile(value = "bar")
	@RequestMapping("/bar/greeting")
	public Greeting barGreeting(@RequestParam(value = "name", defaultValue = "Bar World") String name) {
		logger.debug("activeProfile=" + activeProfile);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

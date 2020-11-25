package com.greeting.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greeting.pojo.Greeting;
import com.greeting.pojo.User;
import com.greeting.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService {
	private static final String template = "Hello, %s!";
	private static AtomicLong counter = new AtomicLong();
	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty() ? "World" : user.toString()));
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreeting(long id) {
		return greetingRepository.findById(id).get();
	}

}

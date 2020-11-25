package com.greeting.service;

import com.greeting.pojo.Greeting;
import com.greeting.pojo.User;

public interface IGreetingService {
	Greeting addGreeting(User user);

	Greeting getGreeting(long id);
}

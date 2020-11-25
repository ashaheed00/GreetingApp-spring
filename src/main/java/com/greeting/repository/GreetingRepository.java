package com.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greeting.pojo.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}

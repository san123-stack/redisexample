package com.example.demo.redis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.redis.web.Person;

@Service
public class Redisservice {

	// store data in redis
	@Cacheable("stringdata")
	public String save() {

		return "dog";
	}

	// Retrieve data from redis
	@Cacheable("stringdata")
	public String getdata() {
		return getdata();
	}

	// store object data in redis
	@Cacheable(value = "person", key = "#id")
	public Person savePerson(long id) {
		Person p = new Person();
		p.setFirstName("santosh" + id);
		p.setLastname("padhi");
		p.setId(id);
		return p;
	}

	// Retrieve object data from redis
	@Cacheable(value = "person", key = "#id")
	public Person getPerson(long id) {
		return getPerson(id);

	}
}

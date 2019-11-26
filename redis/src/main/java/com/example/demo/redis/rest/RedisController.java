package com.example.demo.redis.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.redis.service.Redisservice;
import com.example.demo.redis.web.Person;

@RestController
public class RedisController {
	@Autowired
	Redisservice r;
	@GetMapping("save")
	public String saveData() {
		return "data saved "+r.save();
	}
	@GetMapping()
	public String getData() {
		return "data "+r.getdata();
	}
	@GetMapping("person/save/{id}")
	private void savePersonById(@PathVariable long id) {
		r.savePerson(id);

	}
	@GetMapping("get/person/{id}")
	private Person getPersonById(@PathVariable long id) {
		return r.getPerson(id);

	}
	
}

package com.example.demo.redis.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;

import lombok.Data;

@Data
public class Person  extends SerializableSerializer {
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("lastname")
	private String lastname;
}

package com.example.aspectjdemo

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.beans.factory.annotation.Autowired

@Configurable(preConstruction = true)
class Person {
	@Transient
	@Autowired
	lateinit var userService:UserService
	
	fun sayHello() {
		userService.hello()
	}
}


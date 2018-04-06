package com.example.aspectjdemo

import org.springframework.stereotype.Service

@Service
class UserServiceImpl:UserService{
	override fun hello() {
		println("hello")
	}
}


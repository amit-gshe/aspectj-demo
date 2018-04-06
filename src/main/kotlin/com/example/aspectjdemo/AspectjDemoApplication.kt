package com.example.aspectjdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments
import org.springframework.context.annotation.aspectj.EnableSpringConfigured

@SpringBootApplication
@EnableSpringConfigured
class AspectjDemoApplication:ApplicationRunner{
	override fun run(args: ApplicationArguments?) {
		val person = Person()
		person.sayHello()
		val man = Man()
		man.sayHello()
	}
}

fun main(args: Array<String>) {
    SpringApplication.run(AspectjDemoApplication::class.java, *args)
}

# aspectj-demo
An working example use aspectJ by compile-time weave with kotlin

## How to run
```
mvn clean compile jcabi:ajc exec:java
```
or just
```
mvn spring-boot:run
```

## Features
* Use spring boot framework
* Supports `@EnableSpringConfigured` and `@Configurable` in compile-time woven by `jcabi-maven-plugin` because the `ajc` can not handle the 
kotlin source


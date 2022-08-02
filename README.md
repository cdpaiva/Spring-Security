# Spring-Security

A study on Spring Security with Spring Boot.

The authentication is done by consulting an external postgres db, that contains all the necessary fields to provide the `UserDetails`.
The authorization is done with jwt, that is generated with a POST to the endpoint `/authenticate`.

The token is intercepted by the custom filter defined in [JwtRequestFilter](src/main/java/com/example/SecurityExample/filters/JwtRequestFilter.java).

Almost everything in here is based on an excellent tutorial from [JavaBrains](https://www.youtube.com/watch?v=X80nJ5T7YpE). 
I just added the following:

* Changed from the deprecated `WebSecurityConfigurerAdapter` to a component-based configuration, basically by exposing an `AuthenticatinManager` bean and using a `SecurityFilterChain`. More information on how to do this in [this post](https://spring.io/blog/2022/02/21/spring-security-without-the-websecurityconfigureradapter) from the Spring Blog.

* Added database access to retrieve the user details for authentication.

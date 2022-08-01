# Spring-Security

A study on Spring Security with Spring Boot.

The authentication is done by consulting an external postgres db, that contains all the necessary fields to provide the `UserDetails`.
The authorization is done with jwt, that is generated with a POST to the endpoint `/authenticate`.

The token is intercepted by the custom filter defined in [JwtRequestFilter](src/main/java/com/example/SecurityExample/filters/JwtRequestFilter.java).
The current version is done on top of the deprecated `WebSecurityConfigurerAdapter`.
A new version using custom components is soon to be written.

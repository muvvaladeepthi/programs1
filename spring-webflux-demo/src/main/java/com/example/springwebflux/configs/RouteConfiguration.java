package com.example.springwebflux.configs;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Configuration
public class RouteConfiguration {
	
	
	@Bean
	public RouterFunction<ServerResponse> routes() {
		return route(
				GET("/hello"),
				request -> ServerResponse.ok().body(Mono.just("Hello web flux World"), 
				String.class)
				);
		
	}

}

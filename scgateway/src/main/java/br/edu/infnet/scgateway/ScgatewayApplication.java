package br.edu.infnet.scgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class ScgatewayApplication {
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
					.path("/usuarios/**")
					.uri("http://localhost:8989")
						)
				.route(p -> p
						.path("/artigos/**")
						.filters(f ->f.circuitBreaker(config -> config
								.setName("mycmd")
								.setFallbackUri("forward:/fallback"))
								)
						.uri("http://localhost:8282")
							)
				.build();
	}
	
	@RequestMapping("/fallback")
	public Mono<String> fallback() {
		return Mono.just("fallback");
	}
	

	public static void main(String[] args) {
		SpringApplication.run(ScgatewayApplication.class, args);
	}
	


}

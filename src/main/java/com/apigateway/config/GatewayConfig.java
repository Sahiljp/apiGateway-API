package com.apigateway.config;

import com.apigateway.filter.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("auth", r -> r.path("/auth/**").filters(f -> f.filter(filter)).uri("lb://auth"))
                .route("user-service", r -> r.path("/register/**","/authenticate","/user/**").filters(f -> f.filter(filter)).uri("lb://user-service"))
                .route("product-service", r -> r.path("/product/**").filters(f -> f.filter(filter)).uri("lb://product-service"))
                .route("payment-service", r -> r.path("/order/**").filters(f -> f.filter(filter)).uri("lb://payment-service")).build();
    }

}

package org.ansimar.movieservice.config

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class WebClientConfig {

    @LoadBalanced
    @Bean
    fun webClient(): WebClient.Builder {
        return WebClient.builder()
    }
}
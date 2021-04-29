package org.ansimar.movieservice.services

import org.ansimar.movieservice.dto.Artist
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Service
class ArtistServiceImpl(val webClientBuilder: WebClient.Builder): ArtistService {

    private val artistServiceUrl = "http://artist-service"

    override fun getCastOfMovie(movieId: String): MutableList<Artist>? {
        val webClient: WebClient = webClientBuilder.baseUrl(artistServiceUrl).build();
        val artists: Flux<Artist> =  webClient.get().uri("/movies/$movieId/artists").retrieve().bodyToFlux(Artist::class.java)

        return artists.collectList().block()
    }
}
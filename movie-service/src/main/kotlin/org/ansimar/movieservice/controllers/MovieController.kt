package org.ansimar.movieservice.controllers

import org.ansimar.movieservice.dto.Artist
import org.ansimar.movieservice.dto.Movie
import org.ansimar.movieservice.services.ArtistService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class MovieController(val artistService: ArtistService) {

    @GetMapping("/hello")
    fun hello(): String{
        return "Hello";
    }

    @GetMapping("/movies/{id}")
    fun getMovie(@PathVariable(name="id") id: String): Mono<Movie> {
        val artists = artistService.getCastOfMovie(id) as List<Artist>
        val movie = Movie(cast = artists, movieId = id, title = "An amazing movie")

        return Mono.just(movie)
    }
}
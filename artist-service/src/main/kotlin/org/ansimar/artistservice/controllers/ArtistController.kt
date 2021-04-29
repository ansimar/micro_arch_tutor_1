package org.ansimar.artistservice.controllers

import org.ansimar.artistservice.dto.Artist
import org.ansimar.artistservice.services.ArtistInfoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class ArtistController(val artistInfoService: ArtistInfoService) {

    @GetMapping("/movies/{id}/artists")
    fun getArtists(@PathVariable(name="id") id: String): Flux<Artist>{
        return Flux.fromArray(artistInfoService.getCastInfo(id).toTypedArray())
    }

    @GetMapping("/")
    fun hello(): String{
        return "Hello"
    }
}
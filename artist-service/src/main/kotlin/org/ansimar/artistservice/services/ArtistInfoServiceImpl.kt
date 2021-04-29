package org.ansimar.artistservice.services

import org.ansimar.artistservice.dto.Artist
import org.springframework.stereotype.Service

@Service
class ArtistInfoServiceImpl: ArtistInfoService {

    private val moviesCastFakeDatabase = mapOf<String, List<Artist>>(
            "1234" to listOf(
                            Artist(1, "John Wayne", 67),
                            Artist(2, "Humphrey Bogart", 44),
                            Artist(3, "Lauren Bacall", 33)
                    ),
            "5678" to listOf(
                    Artist(4, "Rutger Hauer", 43),
                    Artist(5, "Charles Chaplin", 31),
             )
    )

    override fun getCastInfo(movieId: String): List<Artist> {
        return if (moviesCastFakeDatabase.containsKey(movieId)){
            moviesCastFakeDatabase[movieId] ?: listOf()
        }else {
            listOf()
        }
    }
}
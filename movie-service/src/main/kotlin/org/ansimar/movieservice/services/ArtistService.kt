package org.ansimar.movieservice.services

import org.ansimar.movieservice.dto.Artist

interface ArtistService {
    fun getCastOfMovie(movieId: String): MutableList<Artist>?
}
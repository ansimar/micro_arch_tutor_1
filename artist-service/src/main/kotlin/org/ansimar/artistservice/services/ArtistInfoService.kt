package org.ansimar.artistservice.services

import org.ansimar.artistservice.dto.Artist

interface ArtistInfoService {
    fun getCastInfo(movieId: String): List<Artist>
}
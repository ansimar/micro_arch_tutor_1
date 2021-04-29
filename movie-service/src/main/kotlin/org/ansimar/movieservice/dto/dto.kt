package org.ansimar.movieservice.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Artist(@JsonProperty("artistId") val artistId: Int,
                  @JsonProperty("name") val name: String,
                  @JsonProperty("age") val age: Int)

data class Movie(val movieId: String, val title: String, val cast: List<Artist>)
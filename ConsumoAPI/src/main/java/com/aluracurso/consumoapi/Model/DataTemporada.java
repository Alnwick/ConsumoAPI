package com.aluracurso.consumoapi.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataTemporada(
        @JsonAlias("Season") Integer numero,
        @JsonAlias("Episodes") List<DataEpisodio> episodios
) {
}

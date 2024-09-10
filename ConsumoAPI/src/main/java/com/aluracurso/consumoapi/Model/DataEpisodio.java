package com.aluracurso.consumoapi.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;

public record DataEpisodio(
       String Title,
       Integer Episode,
       String imdbRating,
       String Released
) {
}

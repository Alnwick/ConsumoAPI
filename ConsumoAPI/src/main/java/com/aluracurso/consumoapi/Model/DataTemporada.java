package com.aluracurso.consumoapi.Model;

import java.util.List;

public record DataTemporada(
        Integer Season,
        List<DataEpisodio> Episodes
) {
}

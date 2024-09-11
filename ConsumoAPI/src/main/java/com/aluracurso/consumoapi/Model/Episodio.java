package com.aluracurso.consumoapi.Model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private double evaluacion;
    private LocalDate fechaDeLanzamiento;

    public Episodio(Integer num, DataEpisodio d){
        this.temporada = num;
        this.titulo = d.titulo();
        this.numeroEpisodio = d.numeroEpisodio();

        try{
            this.evaluacion = Double.parseDouble(d.evaluacion());
        } catch (NumberFormatException e){
            this.evaluacion = 0.0;
        }

        try{
            this.fechaDeLanzamiento = LocalDate.parse(d.fechaDeLanzamiento());
        } catch (DateTimeParseException e){
            this.fechaDeLanzamiento = null;
        }
    }
    public Integer getTemporada() {
        return temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public LocalDate getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    @Override
    public String toString() {
        return "Episodio:" +
                "temporada=" + temporada +
                ", titulo='" + titulo +
                ", numeroEpisodio=" + numeroEpisodio +
                ", evaluacion=" + evaluacion +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento;
    }
}

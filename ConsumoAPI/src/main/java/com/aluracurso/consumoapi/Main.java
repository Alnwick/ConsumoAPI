package com.aluracurso.consumoapi;

import com.aluracurso.consumoapi.Model.DataSerie;
import com.aluracurso.consumoapi.service.ConvertData;
import com.aluracurso.consumoapi.service.UseAPI;

import java.util.Scanner;

public class Main {
    private Scanner scan = new Scanner(System.in);
    private UseAPI useAPI = new UseAPI();
    private final  String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=2dfe139f";
    private ConvertData convert = new ConvertData();

    public void menu(){

        //Datos generales de la Serie
        System.out.println("Serie por buscar: ");
        var name = scan.nextLine();
        var json = useAPI.getData(URL_BASE + name.replace(" ", "+") + API_KEY);
        var data = convert.getData(json, DataSerie.class);

        System.out.println(data);
    }
}

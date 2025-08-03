package br.com.alura.conversor.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Conversor {


    public MoedasOmdb buscaEndereco(String moeda1, String moeda2, String valor){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/b13bb090597015cf58e091e7/pair/"+moeda1+"/"+moeda2+"/"+valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();


        try {
            HttpResponse<String> response  = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MoedasOmdb.class);



        } catch (Exception e) {
            throw new RuntimeException("Nao consegui obter o endereco");
        }





    }
}

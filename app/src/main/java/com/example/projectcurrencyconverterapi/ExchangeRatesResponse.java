// Moldelo de dados (DTO - Data Transfer Object) que representa a resposta json da API
// DTO - Transferencia de dados da API para o projeto
package com.example.projectcurrencyconverterapi;
// Importa a classe Map da biblioteca Java, usada para armazenazar pares de chave-valor


import java.util.HashMap;
import java.util.Map;
public class ExchangeRatesResponse {
//Declara um mapa que armazena taxas de conversão em moedas.
    // A chave (String) representa o cóodigo da moeda (ex: "USD". "BRL"), e o valor (Double) representa a taxa de conversão para essa moeda.
// chave-valor - "Usd", 1.


    private Map<String, Double> conversion_rates = new HashMap<>();

    //Método publico para acessar as taxas de conversão
    //Retorna o mapa contendo as taxas de conversão armazenadas
    public Map<String, Double> getConversion_rates(){
        return conversion_rates;

    }
}

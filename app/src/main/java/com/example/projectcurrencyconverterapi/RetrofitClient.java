// Classe responsável por configurar e fornecer uma instância retrofit

package com.example.projectcurrencyconverterapi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.projectcurrencyconverterapi.ExchangeRateService;
public class RetrofitClient {
// Url base da api que fornece taxas de câmbio

    private static final String BASE_URL = "https://v6.exchangerate-api.com/";


    //Instância do Retrofit que será usada para fazer as requisições.
    private static Retrofit retrofit = null;
    /*Método estático que retorna uma instância do serviço
    @return Uma instância de ExchangeRateService para realizar chamadas à API
     */

    public static ExchangeRateService getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ExchangeRateService.class);
    }
}

package com.example.projectcurrencyconverterapi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

// importando as classes do projeto
import com.example.projectcurrencyconverterapi.RetrofitClient;
import com.example.projectcurrencyconverterapi.ExchangeRateService;
public class MainActivity extends AppCompatActivity{

    private Spinner spinnerMoedaOrigem, spinnerMoedaDestino;
    private EditText etValor;
    private Button btnConverter;
    private TextView tvResultado;

    // Lista de moedas suportados
    private List<String> moedas = List.of("USD", "BRL", "EUR", "GBP", "JPY");

    // Mapa para armazenar as taxas de cambio obtidas da API
    private Map<String, Double> taxasDeCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Define o layout da atividade

        // Incializa os componentes da interface

        spinnerMoedaOrigem = findViewById(R.id.spinnerMoedaOrigem);
        spinnerMoedaDestino = findViewById(R.id.spinnerMoedaDestino);
        etValor = findViewById(R.id.etValor);
        btnConverter = findViewById(R.id.btnConverter);
        tvResultado = findViewById(R.id.tvResultado);

        // Configurar os Spinners com a lista de moedas
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, moedas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMoedaOrigem.setAdapter(adapter);
        spinnerMoedaDestino.setAdapter(adapter);

        // Carrega as taxas de câmbio de API
        carregarTaxasCambio();

        //Configura o botão de conversão
        btnConverter.setOnClickListener(view -> converterMoeda());


    }
    // Método para carregar taxas de câmbio da API
    private void carregarTaxasCambio(){
        ExchangeRateService service = RetrofitClient.getInstance(); // Obtém a instância do Retrofit do serviço
        Call<ExchangeRatesResponse> call = service.getExchangeRates("532a6ee2ba742da7756faa6f", "USD"); // Faz a chamada da API

        // Executa a chamada de forma assincrona
        call.enqueue(new Callback<ExchangeRatesResponse>() {
            @Override
            public void onResponse(Call<ExchangeRatesResponse> call, Response<ExchangeRatesResponse> response) {
                if(response.isSuccessful() && response.body() != null){
                    taxasDeCambio = response.body().getConversion_rates(); // Armazena as taxas de câmbio
                }else{ // Exibe mensagens de erro
                    tvResultado.setText("Erro ao carregar as taxas de câmbio");
                }
            }
            @Override
            public void onFailure(Call<ExchangeRatesResponse> call, Throwable t){
                tvResultado.setText("Erro na conexão");
                return;
            }
        });

    }
    // Método para converter o valor de uma moeda para outra

    private void converterMoeda() {
        String valorTexto = etValor.getText(). toString();  // Obtém o valor digitado pelo usuário

        // Verificar se o valor está vazio
        if(valorTexto.isEmpty()){
            Toast.makeText(this, "Digite um valor válido", Toast.LENGTH_SHORT).show();
            return;
        }

        String moedaOrigem = spinnerMoedaOrigem.getSelectedItem(). toString(); // Obtém a moeda de origem
        String moedaDestino = spinnerMoedaDestino.getSelectedItem(). toString(); // Obtém a moeda de destino
        double valor = Double.parseDouble(valorTexto);

        // Verifica se as taxas de cãio estão disponíveis
        if (taxasDeCambio == null || !taxasDeCambio.containsKey(moedaOrigem) || !taxasDeCambio.containsKey(moedaDestino)){
            tvResultado.setText("Taxas de câmbio indisponíveis");
            return;
        }
        // Obtém as taxas de câmbio patra moedas selecionadas
        double taxaOrigem = taxasDeCambio.get(moedaOrigem);
        double taxaDestino = taxasDeCambio.get(moedaDestino);

        // Calcula o valor convertido
        double valorConvertido = (valor / taxaOrigem) * taxaDestino;

        // Exibe o resultado da conversão formatada
        tvResultado.setText(String.format("Resultado: %.2f %s", valorConvertido, moedaDestino));
    }
}

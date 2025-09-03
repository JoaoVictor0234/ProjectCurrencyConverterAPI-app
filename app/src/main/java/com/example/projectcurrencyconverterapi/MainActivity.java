package com.example.projectcurrencyconverterapi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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

    private Spinner spinnerMoedaOrigem, getSpinnerMoedaDestino;
    private EditText etValor;
    private Button btnConverter;
    private TextView tvResultado;

    // Lista de moedas suportados
    private List<String> moedas = List.of("USD", "BRL", "EUR", "GBP", "JPY");

    // Mapa para armazenar as taxas de cambio obtidas da API
    private Map<String, Double> taxasDeCambio;



}

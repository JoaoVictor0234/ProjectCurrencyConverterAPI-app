
![Badge em Desenvolvimento](https://img.shields.io/badge/FINALIZADO-%20GREEN?style=flat-square&label=STATUS&labelColor=gray)

# ProjectCurrencyConverterAPI-app

Este é um projeto de Conversor de Moedas, que irá facilitar a verificação dos valores de outras moedas e converterá a moeda de nossa escolha, agilizando o processo de pesquisa e conversão.


## Demonstração

Neste projeto aprendemos algumas funcionalidades e como utilizar o **Git**, entendendos como funciona comandos básicos como o **Git Init**, **Git Push**, **Git Status**, **Git add .**, entre outros. Neste projeto contamos com o monitoramento do nosso professor **[@Leonardossrocha](https://github.com/Leonardossrocha)**.

## Funcionalidades

- Conversão diariamente atualizadas.
- Dados verificados.
- Suporte para ser utilizado em celular e computador.

## Etapas do projeto 

 ### Etapa Inicial

- Verificação da proposta. 
- Cadastro na API ExchangeRate-API e obtenção da chave de API.
- Inicialização Ambiente de desenvolvimento utilizada (No caso Android Studio).
- Configuração da ligação entre o repositório local e o remoto.


### Criação e Desenvolvimento das Classes

- **ExchangeRateService** - Contém a interface do projeto.
- **ExchangeRatesResponse** - Em desenvolvimento.
- **RetrofitClient** - Em desenvolvimento.
- **MainActivity** - Em desenvolvimento.

## Etapa Final

- Correção de bugs e pequenas alterações na interface.

## Tecnologias utilizadas

- Ambiente de desenvolvimento: **Android Studio.**
- Linguagem de programação: **Java.** 
- API: **ExchangeRate-API.**
- Controle de Versão: **Git.**

## Imports utilizados e suas funcionalidades

-**import android.os.Bundle**: A classe Bundle é usada para passar dados entre diferentes componentes do Android, como entre uma atividade e outra. Ela funciona como um "pacote" que armazena informações no formato de chave-valor.

-**import android.view.View**: A classe View é a classe base para todos os componentes de interface de usuário (UI) em uma tela, como botões, caixas de texto e layouts. Qualquer coisa que você possa ver na tela é uma View ou uma de suas subclasses.

-**import android.widget.ArrayAdapter**: Essa classe é um adaptador que conecta uma fonte de dados (como uma lista de strings) a uma Spinner (uma lista suspensa) ou a uma ListView. Ela é responsável por criar as views para cada item da lista.

-**import android.widget.Button**: Representa um botão clicável na interface do usuário.

-**import android.widget.EditText**: Representa um campo de texto editável, onde o usuário pode digitar.

-**import android.widget.Spinner**: Representa uma lista suspensa. Ao clicar nela, uma lista de opções é exibida.

-**import android.widget.TextView**: Representa um campo de texto que exibe informações para o usuário, mas que não é editável.

-**import android.widget.Toast**: A classe Toast é usada para exibir uma pequena mensagem pop-up na tela que desaparece automaticamente após um curto período de tempo. É comumente usada para mostrar mensagens de sucesso ou erro.

-**import androidx.appcompat.app.AppCompatActivity**: Esta é uma classe de compatibilidade que herda de Activity. Ela fornece recursos de compatibilidade para garantir que o seu aplicativo funcione em diferentes versões do Android, mantendo um visual consistente. É a classe base para a maioria das atividades em aplicativos Android modernos.

-**import java.util.List**: Representa uma coleção ordenada de elementos. É usada para armazenar listas de dados, como os itens de uma lista suspensa ou os resultados de uma requisição de rede.

-**import java.util.Map**: Representa uma coleção de pares de chave-valor. É usada para armazenar dados de forma estruturada, onde cada valor pode ser acessado por uma chave única.

-**import retrofit2.Call**: A classe Call faz parte da biblioteca Retrofit, que é usada para fazer requisições de rede (como buscar dados de uma API na internet). Uma Call representa uma requisição HTTP que pode ser executada.

-**import retrofit2.Callback**: A interface Callback também é do Retrofit. Ela é usada para lidar com o resultado de uma requisição de rede. O Retrofit chama o método onResponse quando a requisição é bem-sucedida e o método onFailure quando ocorre um erro.

-**import retrofit2.Response**: A classe Response do Retrofit encapsula a resposta de uma requisição HTTP, incluindo o corpo da resposta, o código de status (como 200 OK ou 404 Not Found) e os cabeçalhos.

## Array e sua funcionalidade
Array Adapter = Usado como uma ponte entre dois arquivos, no projeto ele irá vincular o List moedas para os respectivos Spinner.

adapter.setDropDownViewResource = Usado para configurar o adapter para DropDown, assim tornando ele numa espécie de lista para baixo.
## Feedback

Se você tiver algum feedback, por favor nos deixe saber por meio de joaovictorbalbino2007@gmail.com


## Autores

- [@JoaoVictor0234](https://github.com/JoaoVictor0234)


## Referência

 - [Status em Desenvolvimento](https://shields.io/badges)
 - [Como escrever um bom README](https://www.alura.com.br/artigos/escrever-bom-readme?srsltid=AfmBOopQoDqk6cMpOZumRez8eltRBUh0m8EBK9kQaq2tYgrFlYJELvIQ)
 - [README de exemplo](https://github.com/rluispdev/ProjectCurrencyConverter?tab=readme-ov-file)
 - **[Referência dos Imports]**
 Android Developers Documentation: (https://developer.android.com/)  
 Retrofit GitHub Repository: (https://github.com/square/retrofit)  
 Oracle Java Documentation: (https://docs.oracle.com/en/java/javase/)  
 Array Adapter: (https://developer.android.com/reference/android/widget/ArrayAdapter)




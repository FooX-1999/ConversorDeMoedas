package br.com.alura.conversor.main;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);


        Menu menu = new Menu();

        while (menu.getBusca() != 7) {
            System.out.println(menu.getMenu());
            menu.setBusca(leitura.nextInt());
            if (menu.getBusca() != 7){
                System.out.println("Digite o Valor");
                leitura.nextLine();
                menu.setValor(leitura.nextLine());

                System.out.println(menu.toString());
            } else {
                System.out.println("Fim do Programa :-)");
                break;
            }







        }







//        String menu ="""
//                *****************************************************************************
//                Seja bem vindo/a ao br.com.alura.conversor.models.Conversor de Moeda
//
//                1) Dolar =>> Peso Argentino
//                2) Peso argentino =>> Dolar
//                3) Dolar =>> Real Brasileiro
//                4) Real Brasileiro =>> Dolar
//                5) Dolar =>> Peso Colombiano
//                6) Peso Colombiano =>> Dolar
//                7) Sair
//                ******************************************************************************
//
//                Por favor digite uma opcao:
//
//                """;
//        br.com.alura.conversor.models.Buscador buscador = new br.com.alura.conversor.models.Buscador();
//        while (busca != 7){
//
//            System.out.println(menu);
//            busca = leitura.nextInt();
//
//            if (7 == busca){
//                break;
//            }
//
//                System.out.println("Digite o Valor");
//                leitura.nextLine();
//                String valor = leitura.nextLine();
//
//            if (busca == 1) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(1, valor);
//                System.out.println(resultado);
//            } else if (busca == 2) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(2, valor);
//                System.out.println(resultado);
//            } else if (busca == 3) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(3, valor);
//                System.out.println(resultado);
//            } else if (busca == 4) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(4, valor);
//                System.out.println(resultado);
//            } else if (busca == 5) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(5, valor);
//                System.out.println(resultado);
//            } else if (busca == 6) {
//                br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(6, valor);
//                System.out.println(resultado);
//            }
//




//        String moeda1="null";
//        String moeda2="null";
//
//        String valor= "0";
//
//        Scanner leitura = new Scanner(System.in);
//
//        System.out.println("Digite a moeda 1");
//        moeda1= leitura.nextLine();
//        System.out.println("Digite a moeda 2");
//        moeda2= leitura.nextLine();
//        System.out.println("digite o valor?");
//        valor = leitura.nextLine();
//
//
//
//
//
////"https://v6.exchangerate-api.com/v6/b13bb090597015cf58e091e7/pair/USD/BRL/100"
//        HttpClient client = HttpClient.newHttpClient();
//        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/b13bb090597015cf58e091e7/pair/"+moeda1+"/"+moeda2+"/"+valor);
//        System.out.println(endereco);
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(endereco)
//                .build();
//
//        HttpResponse<String> response = client
//                .send(request, HttpResponse.BodyHandlers.ofString());
//        String json = response.body();
//
//        System.out.println(json);
//        Gson gson = new Gson();
//        br.com.alura.conversor.models.MoedasOmdb moedasOmdb = gson.fromJson(json, br.com.alura.conversor.models.MoedasOmdb.class);
//
//        System.out.println(moedasOmdb)

}
}
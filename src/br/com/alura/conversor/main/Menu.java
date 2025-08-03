package br.com.alura.conversor.main;

import br.com.alura.conversor.models.Buscador;
import br.com.alura.conversor.models.MoedasOmdb;

public class Menu extends Buscador {

    private int busca = 0;
    private String valor;



    private String menu ="""
                *****************************************************************************
                Seja bem vindo/a ao Conversor de Moeda
                
                1) Dolar =>> Peso Argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real Brasileiro
                4) Real Brasileiro =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Sair
                ******************************************************************************
                
                Por favor digite uma opcao:
                
                """;


    Buscador buscador = new Buscador();

    public String getMenu() {
        return menu;
    }

    public int getBusca() {
        return busca;
    }

    public void setBusca(int busca) {
        this.busca = busca;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {

        if (busca == 1){
            MoedasOmdb resultado = buscador.opcao(1, valor);
            return "O valor"+ valor +" [USD] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [ARS]";
        } else if (busca == 2){
            MoedasOmdb resultado = buscador.opcao(2, valor);
            return "O valor"+ valor +" [ARS] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [USD]";
        } else if (busca == 3){
            MoedasOmdb resultado = buscador.opcao(3, valor);
            return "O valor"+ valor +" [USD] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [BRL]";
        } else if (busca == 4){
            MoedasOmdb resultado = buscador.opcao(4, valor);
            return "O valor"+ valor +" [BRL] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [USD]";
        } else if (busca == 5){
            MoedasOmdb resultado = buscador.opcao(5, valor);
            return "O valor"+ valor +" [USD] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [COP]";
        } else if (busca == 6){
            MoedasOmdb resultado = buscador.opcao(6, valor);
            return "O valor"+ valor +" [COP] "+"corresponde ao valor final de =>>> " + resultado.conversion_result()+" [USD]";
        }
        return "Aconteceu algum erro ai";
    }

    //        while (busca != 7){
//
//        System.out.println(menu);
//        busca = leitura.nextInt();
//
//        if (7 == busca){
//            break;
//        }
//
//        System.out.println("Digite o Valor");
//        leitura.nextLine();
//        private String valor = leitura.nextLine();
//
//        if (busca == 1) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(1, valor);
//            System.out.println(resultado);
//        } else if (busca == 2) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(2, valor);
//            System.out.println(resultado);
//        } else if (busca == 3) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(3, valor);
//            System.out.println(resultado);
//        } else if (busca == 4) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(4, valor);
//            System.out.println(resultado);
//        } else if (busca == 5) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(5, valor);
//            System.out.println(resultado);
//        } else if (busca == 6) {
//            br.com.alura.conversor.models.MoedasOmdb resultado = buscador.opcao(6, valor);
//            System.out.println(resultado);
//        }
//
//





}

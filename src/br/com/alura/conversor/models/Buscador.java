package br.com.alura.conversor.models;

public class Buscador extends Conversor{

    private String valorConvertido;



    public MoedasOmdb opcao (int opcao, String valor){
        Conversor converte = new Conversor();
    if (opcao == 1){
//        return converte.buscaEndereco("USD", "ARS", valor );
        MoedasOmdb resultado = converte.buscaEndereco("USD", "ARS", valor );
        return resultado;
    } else if (opcao == 2){
        //converte.buscaEndereco("ARS", "USD", valor );
        MoedasOmdb resultado = converte.buscaEndereco("ARS", "USD", valor );
        return resultado;
    } else if (opcao == 3){
//        converte.buscaEndereco("USD", "BRL", valor );
        MoedasOmdb resultado = converte.buscaEndereco("USD", "BRL", valor);
        return resultado;
    } else if (opcao == 4){
//        converte.buscaEndereco("BRL", "USD", valor );
        MoedasOmdb resultado = converte.buscaEndereco("BRL", "USD", valor );
        return resultado;
    } else if (opcao == 5){
//        converte.buscaEndereco("USD", "COP", valor );
        MoedasOmdb resultado = converte.buscaEndereco("USD", "COP", valor );
        return resultado;
    } else if (opcao == 6){
//        converte.buscaEndereco("COP", "USD", valor );
        MoedasOmdb resultado = converte.buscaEndereco("COP", "USD", valor );
        return resultado;
    }


        return null;
    }

}


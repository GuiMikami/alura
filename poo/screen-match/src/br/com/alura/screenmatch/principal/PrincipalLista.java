package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalLista {

    public static void main(String[] args) {
        var filme1 = new Filme("Guardiões da Galáxia", 2023);
        filme1.avalia(8);
        var filme2 = new Filme("Homem aranha", 2022);
        filme2.avalia(7);
        var filme3 = new Filme("Vingadores", 2020);
        filme3.avalia(10);
        var lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo item : lista) { //for-each para percorrer a lista
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { //instanceof verifica se o item é um Filme
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}

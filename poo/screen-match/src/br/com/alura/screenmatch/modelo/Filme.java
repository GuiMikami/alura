package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {


    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    @Override
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
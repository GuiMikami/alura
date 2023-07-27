package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {


    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public String toString() {
        return "Nome do filme: " + getNome() + "\n" + "Ano de lançamento: " + getAnoDeLancamento() +
                "\n" + "------------------------------------------";
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
    }


    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}

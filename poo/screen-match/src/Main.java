import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Vingadores", 2019);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + filme1.pegaMedia());
        System.out.println("-------------------------------------------------------------------");

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(5);
        lost.setEpisodiosPorTemporada(6);
        lost.setMinutosPorEpisodio(35);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Guardiões da Galáxia", 2023);
        filme2.setDuracaoEmMinutos(165);

        var filme3 = new Filme("Homem Aranha", 2023);
        filme3.setDuracaoEmMinutos(163);
        filme3.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(filme3);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("-------------------------------------------------------------------");



        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}

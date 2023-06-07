public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;

    boolean incluidoNoPlano ;

    double somaAvaliacoes;
    int totalAvaliacoes;
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }

    @Override
    public String toString() {
        return "Nome do filme: " + nome
                + "\nAno de lançamento: "+  anoDeLancamento
                + "\nDuração: " + duracaoEmMinutos + " minutos"
                + "\nIncluso no plano: " + incluidoNoPlano;
    }

    public void avaliacao(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double calculaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }

}

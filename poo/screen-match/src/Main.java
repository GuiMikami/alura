public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Vingadores", 2020,160,true);
        System.out.println(filme1.toString());

        filme1.avaliacao(10);
        filme1.avaliacao(7);
        filme1.avaliacao(8.5);

        System.out.println("Média das avaliações: " + filme1.calculaMedia());

    }
}

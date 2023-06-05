import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroChave = new Random().nextInt(100);
        int tentativas = 0;

        System.out.println("""
                -------------------------------------------------------
                *-Jogo de adivinhação-*
                - Tente adivinha o número gerado automaticamente
                - Existem números de 1 a 100
                - Apenas 5 tentativas
                -------------------------------------------------------
                """);

        int count = 1;
        while (tentativas < 5) {

            System.out.println("Tentativa " + count + ": Digite um número ");
            int numeroDigitado = input.nextInt();
            tentativas++;

            if (numeroDigitado == numeroChave) {
                System.out.println("O número gerado é :" + numeroChave);
                System.out.println("Parabéns você conseguiu adivinhar o número!");
                break;
            } else if (numeroDigitado > numeroChave) {
                System.out.println("O número digitado é maior que o número Chave!");
                count++;
            } else if (numeroDigitado < numeroChave) {
                System.out.println("O número digitado é menor que o número Chave!");
                count++;
            }

        }
        if (tentativas == 5) {
            System.out.println("""
                    ---------------------------------------------------------------
                    Infelizmente você não conseguiu adivinhar o número Chave!
                    O número Chave era: """ + numeroChave);
            System.out.println("---------------------------------------------------------------");
        }
    }
}
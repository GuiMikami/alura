import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome = "Guilherme";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------------------------------");

        String menu = """
                --------------------------------------------------------
                -------------------Digite uma opção---------------------
                1- Consultar saldo
                2- Transferência
                3- Depósito
                4- Sair
                --------------------------------------------------------
                """;


        Scanner input = new Scanner(System.in);


        while (opcao != 4) {

            System.out.println(menu);
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor da transferência: ");
                double valor = input.nextDouble();
                if (valor < saldo) {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente para transferência");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor do depósito: ");
                double valor = input.nextDouble();
                saldo += valor;
            } else if (opcao != 4) {
                System.out.println("Opção inválida, digite novamente a opção desejada!");

            }

        }

    }
}

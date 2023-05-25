import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "Severino";
        double saldo = 2500;
        double valor;
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("**************************************");
            System.out.println("*       Bem vindo ao Banco Java      *");
            System.out.println("       Titular:" + usuario);
            System.out.println("   Saldo Atual:" + saldo);
            System.out.println("**************************************");

            System.out.println("Digite as opções desejadas:");
            System.out.println("1-Sacar");
            System.out.println("2-Depositar");
            System.out.println("3-Transferir");
            System.out.println("4-Sair");
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor a ser sacado:");
                     valor = leitor.nextDouble();
                    saldo -= valor;
                    valor =0;
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    valor = leitor.nextDouble();
                    saldo += valor;
                    valor =0;
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    valor = leitor.nextDouble();
                    saldo -= valor;
                    valor =0;
            }
        }

    }
}
package View;

import Banco.Conta;
import Banco.ContaEspecial;
import Banco.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta[] listaConta = new Conta[3];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Qual tipo de conta você deseja abrir?");
            System.out.println("1- Criar conta comum");
            System.out.println("2- Criar conta Poupança");
            System.out.println("3- Criar conta Especial");
            System.out.println("4- sair");


            int escolha = scanner.nextInt();

            int indice = 0;
            switch (escolha) {

                case 1: {

                    System.out.println("Informe o número da conta");
                    int numConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Informe o nome da conta");
                    String nomeConta = scanner.nextLine();

                    listaConta[indice++] = new Conta(numConta, nomeConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                }

                case 2: {

                    System.out.println("Informe o número da conta");
                    int numConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Informe o nome da conta");
                    String nomeConta = scanner.nextLine();

                    listaConta[indice++] = new ContaPoupanca(numConta, nomeConta);
                    System.out.println("Conta poupança criada com sucesso!");
                    break;
                }

                case 3: {

                    System.out.println("Informe o número da conta");
                    int numConta = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Informe o nome da conta");
                    String nomeConta = scanner.nextLine();

                    System.out.println("Informe o limite desejado");
                    double limite = scanner.nextDouble();

                    listaConta[indice++] = new ContaEspecial(numConta, nomeConta, limite);
                    System.out.println("Conta especial criada com sucesso!");
                    break;
                }
                case 4:{
                    System.exit(0);
                }

                default:
                    System.out.println("Opção inválida");
            }
        }


    }
}
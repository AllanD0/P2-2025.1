package Banco;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.println("Number:");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder:");
        String titular = sc.nextLine();

        System.out.println("Initial balance:");
        double valorinicial = sc.nextDouble();

        System.out.println("Withdraw limit:");
        double limitesaque = sc.nextDouble();

        Conta conta = new Conta(numeroConta, titular, valorinicial, limitesaque);

        System.out.println("Enter amount for withdraw:");
        double valorsaque = sc.nextDouble();
        conta.sacar(valorsaque);

        sc.close();

        System.out.println("New balance:");

        System.out.printf("%.2f%n", conta.getSaldo());
    }
}

package src;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total_taxas = 0;
        System.out.println("Enter the number of tax payers");
        int tax = input.nextInt();
        LinkedList<Contribuinte> contribuintes = new LinkedList<>();
        for (int i = 1; i <= tax; i++) {
            System.out.println("Tax payer #" + i + " data"+":");
            System.out.println("Individual or company (i/c)?");
            input.nextLine();
            String tipo = input.nextLine();
            System.out.println("Name:");
            String name = input.nextLine();
            System.out.println("Anual Income");
            double anualIncome = input.nextDouble();
            if(tipo.equalsIgnoreCase("I")) {
                System.out.println("Health expenditures:");
                double healthExpenditures = input.nextDouble();
                PessoaFisica  pf = new PessoaFisica(name, anualIncome, healthExpenditures);
                contribuintes.add(pf);
            }
            else if(tipo.equalsIgnoreCase("C")) {
                System.out.println("Number of employees:");
                int employees = input.nextInt();
                PessoaJuridica pj = new PessoaJuridica(name, anualIncome, employees);
                contribuintes.add(pj);
            }
        }
        System.out.println("TAXES PAID:");
        for (Contribuinte c : contribuintes) {
            double taxa = c.calcularImposto();
            total_taxas += taxa;
            System.out.println(c.nome + ":" +" $ "+ String.format("%.2f",taxa));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: " +"$ "+ String.format("%.2f",total_taxas));

    }
}

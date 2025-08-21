package Hotel.src;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MainReserva  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    try {
        System.out.println("Room Number"); //Quarto
        int numeroQuarto = sc.nextInt();
        sc.nextLine();

        System.out.println("Check-in date (dd/MM/yyyy)"); //Data de entrada
        String checkinDate = sc.nextLine();
        LocalDate checkin = LocalDate.parse(checkinDate, formatter);

        System.out.println("Check-out date (dd/MM/yyyy)"); //data de saida
        String checkoutDate = sc.nextLine();
        LocalDate checkout = LocalDate.parse(checkoutDate, formatter);

        Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
        System.out.println(reserva.toString());

        System.out.println("Enter data to update the reservation:");
        System.out.print("Check-in date (dd/MM/yyyy): ");
        String novocheckinDate = sc.nextLine();
        LocalDate novocheckin = LocalDate.parse(novocheckinDate, formatter);
        System.out.println("Check-out date (dd/MM/yyyy): ");
        String novocheckoutDate = sc.nextLine();
        LocalDate novocheckout = LocalDate.parse(novocheckoutDate, formatter);

        reserva.atualizaDatas(novocheckin, novocheckout);

        System.out.println(reserva.toString());
    }
    catch (DateTimeParseException e) {
        System.out.println("Invalid data");
    }
    }

}
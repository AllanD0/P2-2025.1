package Hotel.src;

import Hotel.src.Exception.CheckoutErrorException;
import Hotel.src.Exception.ReservationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
   private int numeroQuarto;
   private LocalDate checkin;
   private LocalDate checkout;
   private int quantidadedias;
   private DateTimeFormatter formatter;

    public Reserva(int numeroQuarto, LocalDate checkin, LocalDate checkout) {
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        verificar(checkin, checkout);
    }

    public void atualizaDatas(LocalDate novoCheckin, LocalDate novoCheckout){
        verificar(novoCheckin, novoCheckout);
        setCheckin(novoCheckin);
        setCheckout(novoCheckout);
    }

    private void verificar(LocalDate checkin, LocalDate checkout){
        if(checkin.isAfter(checkout) || checkout.isEqual(checkin)){
            throw new CheckoutErrorException("Error in reservation: Check-out date must be after check-in date");
        }
        else if(checkin.isEqual(LocalDate.now()) || checkin.isBefore(getCheckin())) {
            throw new ReservationException("Error in reservation: Reservation dates for update must be future dates");
        }

    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Room: " + numeroQuarto +
                ", Check-in: " + checkin.format(formatter) +
                ", Check-out: " + checkout.format(formatter) +", "+
                 + getQuantidadedias() + " nights";
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }


    public long getQuantidadedias() {
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

}

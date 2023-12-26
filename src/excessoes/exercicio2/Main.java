package excessoes.exercicio2;

import excessoes.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            exercicio2 reservation = new exercicio2(number, checkIn, checkOut);
            System.out.print("-------------------------------");
            System.out.print("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.print("-------------------------------");
            System.out.println("Reservation " + reservation);

        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (DomainException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}

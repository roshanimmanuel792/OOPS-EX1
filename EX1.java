import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        int ticketPrice = 200;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the day of booking:");
        System.out.println("1 - Weekday (Mon-Fri)");
        System.out.println("2 - Weekend (Sat/Sun)");
        int day = sc.nextInt();

        double totalDiscount = 0.0;

        if (age < 5) {
            System.out.println("The ticket is free for you!");
            return;
        } else if (age >= 5 && age <= 18) {
            totalDiscount = 0.40;
        } else if (age >= 19 && age <= 60) {
            totalDiscount = 0.0; // full price
        } else if (age > 60) {
            totalDiscount = 0.30;
        } else {
            System.out.println("Invalid age entered.");
            return;
        }

        if (day == 1) {
            totalDiscount += 0.10; // add 10% extra discount on weekdays
        } else if (day != 2) {
            System.out.println("Invalid day selection.");
            return;
        }

        double finalPrice = ticketPrice * (1.0 - totalDiscount);

        System.out.println("Your ticket price is: " + String.format("%.2f", finalPrice));
    }
}

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        double pennies = 0.01;
        double nickels = 0.05;
        double dimes = 0.20;
        double quarters = 0.25;

        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter " +
                "enough change to make exactly $1.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pennies: ");
        int numberPennies = scanner.nextInt();
        System.out.println("Enter the number of nickels: ");
        int numberNickels = scanner.nextInt();
        System.out.println("Enter the number of dimes: ");
        int numberDimes = scanner.nextInt();
        System.out.println("Enter the number of quarters: ");
        int numberQuarters = scanner.nextInt();

        scanner.close();

        double totalPennies = pennies * numberPennies;
        double totalNickels = nickels * numberNickels;
        double totalDimes = dimes * numberDimes;
        double totalQuarters = quarters * numberQuarters;
        double total = totalPennies + totalNickels + totalDimes + totalQuarters;

        if (total == 1) {
            System.out.println("Yay! Thant's exactly $1.00! You win!");
        }
        else {
            if (total > 1) {
                System.out.println("Your total amount is $" + total);
                System.out.println("You have $" + String.format("%.2f",total-1) + " more than $1.00");
            }
            else {
                System.out.println("Your total amount is $" + total);
                System.out.println("You have $" + String.format("%.2f",1 - total) + " less than $1.00");
            }
        }



    }
}
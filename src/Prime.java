import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number == 2 || number == 3) {
            System.out.println(number + " is prime.");
        } else if (number > 3) {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime.");
                } else {
                    System.out.println(number + " is prime.");
                }
            }
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}

import java.util.Scanner;

public class PrimeNumber {
    static boolean prime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 2, number;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prime number: ");
        number = sc.nextInt();
        while (count < number) {
            if (prime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}

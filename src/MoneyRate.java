
import java.util.Scanner;

public class MoneyRate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int VND,USD;
        final int RATEUSD=23000;

        System.out.println("Enter value USD: ");
        USD=sc.nextInt();
        VND=USD*RATEUSD;
        System.out.printf("%d VND", VND);
    }
}

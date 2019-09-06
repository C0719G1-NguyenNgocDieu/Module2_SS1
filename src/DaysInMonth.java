import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thang 1-12: ");
        byte month = input.nextByte();
        if (month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang " + month + " co 31 ngay.");
                    break;
                case 2:
                    System.out.println("Thang 2 co 28 hoac 29 ngay.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang " + month + " co 30 ngay.");
            }
        }else {
            System.out.println("loi.");
        }
    }
}

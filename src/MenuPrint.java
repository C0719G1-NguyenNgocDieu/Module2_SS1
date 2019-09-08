import java.util.Scanner;

public class MenuPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print the isosceles triangle");
        System.out.print("Number select: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                rectangle();
                break;
            case 2:
                squareTriangle();
                break;
            case 3:
                isoscelesTriangle();
                break;
        }
    }

    static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    static void squareTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = sc.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = width; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void isoscelesTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = width; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

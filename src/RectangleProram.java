import java.util.Scanner;

public class RectangleProram {
    public static void main(String[] args) {
        float height;
        float weight;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = weight * height;
        System.out.println("Area: " + area);
    }
}

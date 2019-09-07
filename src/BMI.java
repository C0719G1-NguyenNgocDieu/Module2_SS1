import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your weight(in kilogram): ");
        float weight = sc.nextFloat();
        System.out.println("Your height(in meter): ");
        float height = sc.nextFloat();

        double bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "BMI", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20f%s", bmi, "Obese");
        }
    }
}

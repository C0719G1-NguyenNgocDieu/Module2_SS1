import java.util.Scanner;

public class SomeRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int ones = number % 10;
        String one;
        int tens = (number / 10) % 10;
        String ten;
        int hundreds = number / 100;
        String hundred;
        String teen;

        switch (ones) {
            case 1:
                one = "one";
                break;
            case 2:
                one = "two";
                break;
            case 3:
                one = "three";
                break;
            case 4:
                one = "four";
                break;
            case 5:
                one = "five";
                break;
            case 6:
                one = "six";
                break;
            case 7:
                one = "seven";
                break;
            case 8:
                one = "eight";
                break;
            case 9:
                one = "nine";
                break;
            default:
                one = "";
        }

        switch (tens) {
            case 2:
                ten = "twenty";
                break;
            case 3:
                ten = "thirty";
                break;
            case 4:
                ten = "forty";
                break;
            case 5:
                ten = "fifty";
                break;
            case 6:
                ten = "sixty";
                break;
            case 7:
                ten = "seventy";
                break;
            case 8:
                ten = "eighty";
                break;
            case 9:
                ten = "ninety";
                break;
            default:
                ten = "";
        }

        switch (hundreds) {
            case 1:
                hundred = "one hundred";
                break;
            case 2:
                hundred = "two hundred";
                break;
            case 3:
                hundred = "three hundred";
                break;
            case 4:
                hundred = "four hundred";
                break;
            case 5:
                hundred = "five hundred";
                break;
            case 6:
                hundred = "six hundred";
                break;
            case 7:
                hundred = "seven hundred";
                break;
            case 8:
                hundred = "eight hundred";
                break;
            case 9:
                hundred = "nine hundred";
                break;
            default:
                hundred = "";
        }

        if (number == 0) {
            System.out.println("zero");
        } else if (number < 10) {
            System.out.println(one);
        } else if (number < 20) {
            switch (ones) {
                case 1:
                    teen = "eleven";
                    break;
                case 2:
                    teen = "twelve";
                    break;
                case 3:
                    teen = "thirteen";
                    break;
                case 5:
                    teen = "fifteen";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    teen = one + " teen";
                    break;
                default:
                    teen = "";
            }
            System.out.println(teen);
        } else if (number < 100) {
            System.out.println(ten + " " + one);
        } else if (number < 1000) {
            System.out.println(hundred + " and " + ten + " " + one);
        }
    }
}

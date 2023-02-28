import java.util.Scanner;

public class Task4 {
    public static void Palindrome() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть число  від 1000 до 9999: ");

        int number = input.nextInt();
        if (number > 1000 && number < 9999) {

            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number /= 10;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " є палiндромом.");
            } else {
                System.out.println(originalNumber + " не є палiндромом.");
            }
        } else {
            System.out.println("неправильне число");
        }
    }

}

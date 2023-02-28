import java.util.Scanner;

public class Task3 {
    public static void Triangle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть довжину сторони a: ");
        double a = input.nextDouble();

        System.out.print("Введіть довжину сторони b: ");
        double b = input.nextDouble();

        System.out.print("Введіть довжину сторони c: ");
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Трикутник є рівностороннім.");
            } else if (a == b || b == c || c == a) {
                System.out.println("Трикутник є рівнобедреним.");
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("Трикутник є прямокутним.");
            } else {
                System.out.println("Трикутник є довільним.");
            }
        } else {
            System.out.println("Такого трикутника не існує.");
        }
    }
}

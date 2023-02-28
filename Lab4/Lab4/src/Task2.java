import java.util.Scanner;

public class Task2 {
    public static void Numbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введiть значення x");
        double x = scanner.nextDouble();

        System.out.println("Введiть значення y");
        double y = scanner.nextDouble();

        if (x < 0 && y < 0) {
            x = Math.abs(x);
            y = Math.abs(y);
        }

        else if (x < 0 || y < 0) {
            x++;
            y++;
        }

        else if (x >= 2 && x <= 9 && y >= 2 && y <= 9) {
            x /= 10;
            y /= 10;
        }

        System.out.println(x + ',' + y);

    }
}

import java.util.Scanner;

public class Task5 {
    public static void Month() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер місяця: ");
        int month = scanner.nextInt();

        int daysInMonth;
        switch (month) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
            default:
                System.out.println("Введено неправильний номер місяця.");
                return;
        }

        System.out.println("Кількість днів у місяці: " + daysInMonth);
    }
}

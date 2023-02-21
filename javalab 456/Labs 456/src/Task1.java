
public class Task1 {

    public static void Month(int month) {
        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            days = 28;
        } else {
            System.out.println("Некоректний номер місяця.");
            return;
        }

        System.out.println("Кількість днів у цьому місяці: " + days);
    }

}

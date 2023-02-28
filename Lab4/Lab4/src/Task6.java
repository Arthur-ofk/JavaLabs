import java.util.Scanner;

public class Task6 {
    public static void Age() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть вік: ");
        int age = input.nextInt();
        input.close();
        String description;

        if (age % 10 == 1 && age != 11) {
            description = age + " рік";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age < 10 || age > 20)) {
            description = age + " роки";
        } else {
            description = age + " років";
        }

        System.out.println(description);
    }
}

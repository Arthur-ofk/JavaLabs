import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("оберiть номер завдання");
            int option = sc.nextInt();

            switch (option) {

                case 1:

                    System.out.println("Введіть оцінку з математики(від 1 до 5)");
                    int Math = sc.nextInt();

                    System.out.println("Введiть оцінку з програмування (від 1 до 5)");
                    int programming = sc.nextInt();

                    System.out.println("Введiть оцінку з фiлософiї (від 1 до 5)");
                    int philosophy = sc.nextInt();
                    Task1 task1 = new Task1(Math, programming, philosophy);
                    task1.Grades();
                    break;
                case 2:
                    System.out.println("Введiть х");
                    double x = sc.nextDouble();
                    System.out.println();
                    double y = sc.nextDouble();
                    Task2 task2 = new Task2(x, y);
                    task2.Numbers(x, y);
                    break;
                case 3:
                    System.out.print("Введіть довжину сторони a: ");
                    int a = sc.nextInt();

                    System.out.print("Введіть довжину сторони b: ");
                    int b = sc.nextInt();

                    System.out.print("Введіть довжину сторони c: ");
                    int c = sc.nextInt();
                    Task3 task3 = new Task3(a, b, c);
                    task3.Triangle();
                    break;
                case 4:
                    System.out.print("Введіть число  від 1000 до 9999: ");

                    int number = sc.nextInt();
                    Task4 task4 = new Task4(number);
                    task4.Palindrome();
                    break;
                case 5:
                    System.out.print("Введіть номер місяця: ");
                    int month = sc.nextInt();
                    Task5 task5 = new Task5(month);
                    task5.Month();

                    break;
                case 6:
                    System.out.print("Введіть вік: ");
                    int age = sc.nextInt();
                    Task6 task6 = new Task6(age);
                    task6.Age();

                    break;
                case 7:
                    System.exit(1);
            }
        }

    }
}

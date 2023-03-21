import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("оберiть номер завдання");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("ВВедіть а");
                    int a = sc.nextInt();
                    Task1 task1 = new Task1();
                    System.out.println(task1.count(a));
                    break;
                case 2:
                    System.out.println("Введіть кількість учнів");
                    int n = sc.nextInt();
                    Task2 task2 = new Task2();
                    int[] grades = task2.numbers(option);

                    System.out.println("к-сть двійок: " + grades[0]);
                    System.out.println("к-сть трійок: " + grades[1]);
                    System.out.println("к-сть четвірок: " + grades[2]);
                    break;
                case 3:
                    System.out.println("Введіть площі квадратів");
                    double[] squares = new double[5];
                    for (int i = 0; i < 5; i++) {
                        squares[i] = sc.nextDouble();
                    }
                    Task3 task3 = new Task3();
                    System.out.println("Найбільша діагональ:" + task3.squares(squares));
                    break;
                case 4:
                    System.out.println("Введіть число");
                    int arg41 = sc.nextInt();
                    Task4 task4 = new Task4();
                    System.out.println(task4.sum(arg41));
                    break;
                case 5:
                    System.out.println("Ведіть границю а");
                    int arg51 = sc.nextInt();
                    System.out.println("Ведіть границю b");
                    int arg52 = sc.nextInt();
                    System.out.println("Ведіть кількість");
                    int arg53 = sc.nextInt();
                    Task5 task5 = new Task5();
                    System.out.println("к-сть чисел які кратні 3 і не містять останню цифру 0"
                            + task5.numbers(arg51, arg52, arg53));
                    break;
                case 6:
                    System.out.println("Введіть n");
                    int arg61 = sc.nextInt();
                    Task6 task6 = new Task6();
                    Model model = task6.Numbers(arg61);
                    for (int i = 0; i < 5; i++) {
                        System.out.println(model.getSequence()[i]);

                    }
                    System.out.println(model.getQuantity());
                    System.out.println(model.getSum());
                    break;
                case 7:
                    Task7 task7 = new Task7();
                    int[] numbers = task7.Numbers();
                    for (int i = 0; i < 10; i++) {
                        System.out.println(numbers[i]);
                    }
                    break;
                case 8:
                    System.exit(1);
                    break;

            }
        }

    }
}

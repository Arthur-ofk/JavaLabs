import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("оберiть номер завдання");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ведiть a");
                    int a = sc.nextInt();
                    Task1 task1 = new Task1();
                    var list = task1.Count(a);
                    for (int number : list) {
                        System.out.println(number);

                    }
                    break;
                case 2:
                    System.out.println("Введіть  n");
                    int n = sc.nextInt();
                    Task2 task2 = new Task2();
                    var numbers = task2.Multiply(n);
                    for (String number : numbers) {
                        System.out.println(number);

                    }
                    break;
                case 3:
                    System.out.println("Введiть а");
                    int arg31 = sc.nextInt();
                    System.out.println("Введiть б");
                    int arg32 = sc.nextInt();
                    System.out.println("Введiть розмiр кроку");
                    int arg33 = sc.nextInt();
                    Task3 task3 = new Task3();
                    System.out.println(task3.Average(arg31, arg32, arg33));
                    break;
                case 4:
                    System.out.println("Введіть х");
                    int arg41 = sc.nextInt();
                    System.out.println("Введiть y");
                    int arg42 = sc.nextInt();
                    Task4 task4 = new Task4();
                    System.out.println(task4.Multiply(arg41, arg42));

                case 5:
                    System.out.println("Введiть а");
                    int arg = sc.nextInt();
                    System.out.println("Введiть b");
                    int arg2 = sc.nextInt();
                    System.out.println("Введiть n");
                    int arg3 = sc.nextInt();
                    Task5 task5 = new Task5();

                    task5.Aray(arg, arg2, arg3);

                    System.out.println("Масив чисел:");
                    for (int i = 0; i < arg3; i++) {
                        System.out.println(task5.arr[i]);
                    }
                    int[] res = task5.Numbers();
                    System.out.println("Кiлькiсть чисел, якi кратнi 3 i не кратнi 5: " + res[0]);
                    System.out.println("Кiлькiсть чисел, якi є квадратами парних чисел: " + res[1]);
                    break;
                case 6:
                    System.out.println("Введiть n");
                    int arg6 = sc.nextInt();
                    Task6 task6 = new Task6();
                    System.out.println(task6.algebraicSum(arg6));
                    break;
            }
        }
    }
}

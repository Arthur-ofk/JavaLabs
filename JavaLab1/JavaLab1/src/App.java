import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tasks tasks = new Tasks();
        while (true) {
            System.out.println("\n" + "Оберiть Задачу");
            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Ведiть номер мiсяця");
                    int m = scanner.nextInt();
                    tasks.Task1(m);
                    break;
                case 2:
                    System.out.println("Введiть номер операції\n1-додавання\n2-вiднiмання\n3-множення\n4-дiлення");
                    int n = scanner.nextInt();
                    System.out.println("Введiть А та B\nA");
                    int a = scanner.nextInt();
                    System.out.println("B");
                    int b = scanner.nextInt();
                    tasks.Task2(n, a, b);
                    break;
                case 3:
                    System.out.println("ВВедiть кiлькiсть грибiв");
                    int k = scanner.nextInt();
                    tasks.Task3(k);
                    break;
                case 4:
                    System.out.println("Введiть 3 значення\nA");
                    int _a = scanner.nextInt();
                    System.out.println("B");
                    int _b = scanner.nextInt();
                    System.out.println("C");
                    int _c = scanner.nextInt();
                    tasks.Task4(_a, _b, _c);
                    break;
                case 5:
                    System.out.println("Введiть оцiнку");
                    int g = scanner.nextInt();
                    tasks.Task5(g);
                    break;
                case 6:
                    System.out.println("Введiть номер бiлета");
                    String t = scanner.next();
                    tasks.Task6(t);
                    break;
                case 7:
                    System.out.println("введiть 4 значення\nA");
                    double p1 = scanner.nextDouble();
                    System.out.println("B");
                    double p2 = scanner.nextDouble();
                    System.out.println("C");
                    double p3 = scanner.nextDouble();
                    System.out.println("D");

                    double p4 = scanner.nextDouble();
                    tasks.Task7(p1, p2, p3, p4);

            }
        }
    }
}

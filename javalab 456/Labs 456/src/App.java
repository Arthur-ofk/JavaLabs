import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть номер завдання");
            int option = scanner.nextInt();
            switch (option) {

                case 1:
                    System.out.println("введіть номер місяця");
                    int month = scanner.nextInt();
                    Task1.Month(month);
                    break;
                case 2:
                    Multiply.print();
                    break;
                case 3:
                    System.out.println("введіть n");
                    int n = scanner.nextInt();
                    Sumer.Sum(n);
                    break;
                case 4:
                    Numbers.Print();
                    break;
                case 5:
                    System.out.println("введіть номер операцiї");
                    int a = scanner.nextInt();
                    System.out.println("введiть А");
                    int b = scanner.nextInt();
                    System.out.println("введiть B");
                    int c = scanner.nextInt();
                    Counter.Count(a, b, c);
                    break;
                case 6:
                    System.exit(1);
            }
        }
    }
}

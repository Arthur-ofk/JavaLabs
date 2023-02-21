public class Counter {
    public static void Count(int a, int b, int c) {
        if (a == 1) {
            System.out.println(c + b);

        } else if (a == 2) {
            System.out.println(b - c);
        } else if (a == 4) {
            if (b == 0) {
                System.out.println("неправильне число");

            } else {
                System.out.println(b / c);
            }
        } else if (a == 3) {
            System.out.println(a * b);
        }
    }
}

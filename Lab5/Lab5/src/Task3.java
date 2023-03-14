public class Task3 {
    int sum = 0;
    int q = 0;

    public int Average(int a, int b, int h) {
        if (h > Math.abs(a - b)) {
            System.out.println("incorrect h");
            return 0;
        } else {
            for (int i = a; i < b; i = +h) {
                sum += i;
                q++;
            }
            int average = sum / q;
            return average;
        }
    }
}

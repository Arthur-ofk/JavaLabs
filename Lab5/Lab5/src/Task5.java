import java.util.Random;

public class Task5 {
    Random random = new Random();
    int[] results = new int[2];
    int count1 = 0;
    int count2 = 0;
    int n;

    public void Aray(int a, int b, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(b - a) + a;
        }
        this.arr = arr;
    }

    int[] arr;

    public int[] Numbers() {
        for (int item : arr) {
            if (item % 3 == 0 && item % 5 != 0) {
                count1++;
            }

            if (item % 2 == 0) {
                int sqrt = (int) Math.sqrt(item);
                if (sqrt * sqrt == item) {
                    count2++;
                }
            }
        }
        results[0] = count1;
        results[1] = count2;
        return results;
    }

}

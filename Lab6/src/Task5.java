import java.util.Random;

public class Task5 {

    public int numbers(int a, int b, int n) {
        int j = 0;
        int resp = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(b - a) + a;
        }

        while (j < n) {
            if (arr[j] % 3 == 0 && arr[j] % 10 != 0) {
                resp++;

            }
            j++;
        }
        return resp;
    }
}

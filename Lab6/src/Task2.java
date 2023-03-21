import java.util.Random;

public class Task2 {

    public int[] numbers(int n) {
        int[] resp = new int[3];

        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            grades[i] = new Random().nextInt(5 - 1) + 1;

        }
        int j = 0;
        while (j < n - 1) {
            if (grades[j] == 2) {
                resp[0]++;
            }
            if (grades[j] == 3) {
                resp[1]++;
            }
            if (grades[j] == 4) {
                resp[2]++;
            }
            j++;
        }
        return resp;
    }
}

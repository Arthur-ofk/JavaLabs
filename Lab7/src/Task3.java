import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    Scanner sc = new Scanner(System.in);
    int size;
    int j = 0;

    public Task3(int n) {
        this.size = n;
    }

    int newsize = size + 2;
    int[] numbers = new int[size];
    int[] resp = new int[newsize];

    public void fill() {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        numbers = array;
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        for (int i = 0; i < size; i++) {

            if (array[i] == max) {
                resp[j] = array[i];
                ++j;
                resp[j] = min;
                ++j;

            }
            if (array[i] == min) {
                resp[j] = array[i];
                ++j;
                resp[j] = max;
                ++j;

            }
            if (array[i] == max || array[i] == min) {
                i++;
            }

            if (j != newsize && i != size) {
                resp[j] = array[i];
                j++;
            }

        }
    }

}

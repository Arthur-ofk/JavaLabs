import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    Scanner sc = new Scanner(System.in);
    int size;

    public Task2(int n) {
        this.size = n;
    }

    Integer[] numbers = new Integer[size];

    public void fill() {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        numbers = array;
    }

    public int[] sort() {
        int newSize = size;
        int j = 0;
        for (int i = 0; i < size; i++) {

            if (i + 1 != size && numbers[i + 1] >= 0 && numbers[i + 1] <= 5) {
                numbers[i] = null;
                --newSize;

            }

        }
        int[] newArray = new int[newSize];
        for (int i = 0; i < size; i++) {
            if (numbers[i] != null) {
                newArray[j] = numbers[i];
                j++;
            }
        }
        Arrays.sort(newArray);

        return newArray;
    }
}

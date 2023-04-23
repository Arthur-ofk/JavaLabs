import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    int size;

    public Task1(int n) {
        this.size = n;
    }

    double[] numbers;
    int[] cutedNumbers = new int[size];

    public void create() {
        double[] Numbers = new double[size];
        for (int i = 0; i < size; i++) {
            Numbers[i] = new Random().nextInt(10 - (-10)) + (-10);

        }
        numbers = Numbers;
    }

    public void cut() {
        int[] cuted = new int[size];
        for (int i = 0; i < size; i++) {
            cuted[i] = (int) numbers[i];

        }
        cutedNumbers = cuted;
    }

    public int[] oddNum() {
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (cutedNumbers[i] % 2 != 0) {
                temp.add(cutedNumbers[i]);
            }

        }
        int[] odd = new int[temp.size()];

        Collections.sort(temp, Collections.reverseOrder());
        for (int i = 0; i < temp.size(); i++)
            odd[i] = temp.get(i);
        return odd;
    }

}

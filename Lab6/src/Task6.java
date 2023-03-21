import java.util.Random;

public class Task6 {

    public Model Numbers(int n) {
        double[] arr = new double[n];
        int sum = 0;
        int quantity = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextDouble(n - 0) + 0;
        }

        while (j < n) {
            if (arr[j] <= 2) {
                arr[j] = 0;
            }
            if (arr[j] > 3 && arr[j] < 7) {
                sum += arr[j];
                quantity++;
            }
            j++;

        }
        Model model = new Model(arr, sum, quantity);
        return model;
    }

}

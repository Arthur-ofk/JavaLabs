public class Task7 {
    public int[] Numbers() {
        int[] numbers = new int[10];

        int i = 100;
        int j = 0;
        while (j < 10) {
            if (i % 10 == 7 && i % 9 == 0) {
                numbers[j] = i;

                j++;
            }
            i++;

        }
        return numbers;

    }
}

public class Task4 {

    public int sum(int n) {
        int sum = 0;
        int i = 1;
        int j = 1;
        while (i <= n && j <= n) {

            sum += (1 + i + j);
            i++;
            j++;
        }
        return sum;
    }
}

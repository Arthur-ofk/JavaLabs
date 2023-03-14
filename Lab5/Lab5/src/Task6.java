public class Task6 {
    public int algebraicSum(int n) {

        int sum = 0;

        for (int i = 1, j = 1; i <= n && j <= n; i++, j++) {
            sum += (1 + i + j);
        }
        return sum;
    }
}

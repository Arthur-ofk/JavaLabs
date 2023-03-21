import java.util.Arrays;

public class Task3 {

    public double squares(double squares[]) {
        double[] diagonales = new double[5];
        int i = 0;
        while (i < 5) {
            diagonales[i] = Math.sqrt(squares[i] * 2);
            i++;
        }

        Arrays.sort(diagonales);
        return diagonales[4];

    }

}

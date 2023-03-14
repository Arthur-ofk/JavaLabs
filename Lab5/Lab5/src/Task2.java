import java.util.ArrayList;

public class Task2 {
    public ArrayList<String> Multiply(int n) {
        ArrayList<String> numbers = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(n + " x " + i + " = " + (n * i));
        }

        return numbers;
    }
}

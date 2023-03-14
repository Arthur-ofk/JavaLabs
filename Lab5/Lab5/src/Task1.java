import java.util.ArrayList;

public class Task1 {
    int resp;

    public ArrayList<Integer> Count(int a) {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i = a; i > 10; i--) {
            if (i % 2 == 1) {
                squares.add(i * i);

            }
        }
        return squares;
    }
}

public class Task4 {

    int product = 0;

    public int Multiply(int x, int y) {
        for (int i = 0; i < y; i++) {
            product += x;
        }
        return product;
    }

}

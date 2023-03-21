public class Model {
    private double[] sequence;
    private int sum;
    private int quantity;

    public Model(double[] sequence, int sum, int quantity) {
        this.sequence = sequence;
        this.sum = sum;
        this.quantity = quantity;
    }

    public double[] getSequence() {
        return sequence;
    }

    public int getSum() {
        return sum;
    }

    public int getQuantity() {
        return quantity;
    }

}

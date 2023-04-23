import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        Task3 task3 = new Task3(4);
        task3.fill();
        int[] resp = task3.resp;
        for (int i : resp) {
            System.out.println(i);
        }
    }
}

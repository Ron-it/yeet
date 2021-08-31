import java.util.stream.*;

public class spc {

    public static void main(String[] args) {

        int n = IBIO.inputInt("How many? ");

        int x[] = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = IBIO.inputInt();
        }

        int sum = IntStream.of(x).sum();

        double tt = (sum * 0.15) + 0.01;
        System.out.println(tt);
    }
}

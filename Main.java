import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (checkBilanganPrima(i)) {
                continue;
            }

            String output = "";
            if (i % 3 == 0) {
                output += "Foo";
            }
            if (i % 5 == 0) {
                output += "Bar";
            }
            if (output.isEmpty()) {
                output = Integer.toString(i);
            }
            result.add(output);
        }

        Collections.reverse(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    public static boolean checkBilanganPrima(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

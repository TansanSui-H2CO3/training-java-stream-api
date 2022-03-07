import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        // Trial of stream API
        Arrays.asList(1, 2, 3)
            .stream()
            .forEach(element -> System.out.println(element));
    }
}
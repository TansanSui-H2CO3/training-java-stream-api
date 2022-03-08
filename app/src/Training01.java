import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Training01 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        
        printAsStream(intList);
        System.out.println(sample(intList).orElse(999));
    }

    private static void printAsStream(List<Integer> intList) {
        System.out.println("ListをStreamに変換して一覧表示する。");
        intList.stream().forEach(System.out::println);
        System.out.println();
    }

    private static Optional<Integer> sample(List<Integer> intList) {
        return intList.stream()
            .filter(element -> element > 3)
            .findFirst();
    }
}
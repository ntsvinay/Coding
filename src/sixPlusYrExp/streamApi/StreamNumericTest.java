package sixPlusYrExp.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamNumericTest {
    public static void main(String[] args) {
        List<Integer> arrLst=Arrays.asList(1, 2, 4, 6, 8,3,2);

        System.out.println(arrLst.stream().reduce((a, b)->a+b));

        arrLst.stream().distinct().forEach(a->System.out.print(a));
        System.out.println();
        arrLst.stream().distinct().sorted(Comparator.naturalOrder()).forEach(a->System.out.print(a));
        System.out.println();
        System.out.println(arrLst.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
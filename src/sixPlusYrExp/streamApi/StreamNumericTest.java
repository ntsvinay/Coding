package sixPlusYrExp.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNumericTest {
    public static void main(String[] args) {

        List<Integer> arrLst=Arrays.asList(1, 2, 4, 6, 8,3,2);

        System.out.println(arrLst.stream().reduce((a, b)->a+b));
        arrLst.stream().distinct().forEach(a->System.out.print(a));
        System.out.println();
        arrLst.stream().distinct().sorted(Comparator.naturalOrder()).forEach(a->System.out.print(a));
        System.out.println();
        System.out.println(arrLst.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println();
        arrLst.stream().filter(a->a%2==0).forEach(System.out::print);
        System.out.println();
        System.out.println("Max  --"+arrLst.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Min  --"+arrLst.stream().min(Comparator.naturalOrder()).get());

        System.out.println("---------Top sorted Element and Lowest sorted Element-------------");

        arrLst.stream().sorted().limit(3).skip(1).forEach(System.out::print);
        System.out.println();
        arrLst.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
        System.out.println();
        System.out.println("----sum of Integers-----");
        int num=1246832;

        System.out.print(Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt)));
        System.out.println();

        System.out.println("print int Sum----" +Stream.of(String.valueOf(num).split("")).reduce((a,b)->a+b));
        System.out.println("---------high number-------");
        Stream.of(String.valueOf(num).split("")).
                sorted(Comparator.reverseOrder()).distinct().limit(1).forEach(System.out::print);

        System.out.println();
        System.out.println("----Array Sorting-----");
        int arr1[]=new int[]{1, 2, 4};
        int arr2[]=new int[]{6, 8,3,2};

        int[] fin=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(fin));

        int[] fin1=IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(fin1));



    }
}
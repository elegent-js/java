package fun.elegentjs.lambda;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppleFilter {

    public static void main(String[] args) {

        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );

        pythagoreanTriples.forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));


        Stream.iterate(new long[]{0, 1}, t -> new long[]{t[1], t[0] + t[1]})
                .limit(50)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ")"));


        System.out.println(Runtime.getRuntime().availableProcessors());


    }



}

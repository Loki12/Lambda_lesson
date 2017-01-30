package stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Задание 4
 *
 * Допустим имеется массив int[] value = {1, 4, 9, 16}. Что дает вывод метода Stream.of(values)?
 * Как получить поток ввода-вывода значений int?
 *
 * Created by Sergej on 29.01.2017.
 */
class Stream1 {

    Stream1() {
        int[] values = {1, 4, 9, 16};
        IntStream stream = toStream(values);
        stream.forEach(System.out::println);
    }

    private IntStream toStream(int [] values)
    {
        /*List<Integer> list = new ArrayList<>();
        for (int i: values)  { list.add(i); }*/

        return Arrays.stream(values);

    }
}

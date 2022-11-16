package comparatorExamples;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

public class SortNumbers implements Comparable {


    public static void main(String[] args) {

        List list = new LinkedList<>();

        list.add(new Float(34.3));
        list.add(new Float(13.7));
        list.add(new Float(25.4));
        list.add(new Float(0.9));
        list.add(new Float(66.1));

        sort(list);
        System.out.println("Print numbers in Order");
        System.out.println(list);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}

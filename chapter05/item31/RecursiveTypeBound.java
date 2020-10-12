package chapter05.item31;
import java.util.*;

// Using a recursive type bound with wildcards (Page 143)
public class RecursiveTypeBound {
    // a comparable of E consumes E instances (and produces integers indicating order relations).
    public static <E extends Comparable<? super E>> E max(
        List<? extends E> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException("Empty list");

        E result = null;
        for (E e : list)
            if (result == null || e.compareTo(result) > 0)
                result = e;

        return result;
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        System.out.println(max(argList));
    }
}
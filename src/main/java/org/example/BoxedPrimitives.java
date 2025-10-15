package org.example;
import java.util.List;
import java.util.ArrayList;

public class BoxedPrimitives {

    // depreciated way, marked for removal, don't use
    private static Integer i = new Integer(33);
    // use this way
    private static Integer a = 42; // Boxed primitive (Integer object)
    private static Integer b = 20;
    private static Integer c = a + b; // Unboxing occurs here for the addition

    public static void primitive() {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(a); // Autoboxing occurs here
        arrayList.add(b);
        arrayList.add(c);

        StringBuilder sb = new StringBuilder();
        sb.append("ArrayList contents: ");

        for (Integer num : arrayList) {
            sb.append(num).append(" "); // Unboxing occurs here when num is used in a
        } // end for loop

        System.out.println(sb);

    } // end primitive method
}

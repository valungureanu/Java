package md.tekwill.lectia22;

import java.lang.*;
import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        Object arr[] = {1, "Unu"};
        List<String> list = new ArrayList<>();


        list.add("unu");
        list.add("doi");

        List<String> list1 = new ArrayList<>();
        list1.add("trei");
        list1.add("patru");

        list.add(1, "trei");

        String elementDoi = list.get(1);
        System.out.println(elementDoi);
        System.out.println(list);

        list1.addAll(list);

        System.out.println(list1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String element : list) {
            System.out.println(element);
        }

        Iterator<String> stringIterator = list.iterator();
        System.out.println(stringIterator.next());

        while  (stringIterator.hasNext()){
            System.out.println("--> "+stringIterator.next());
        }

        list = new LinkedList<>();
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasPrevious()){
            System.out.println("<-- "+stringIterator.next());
        }
    }
}

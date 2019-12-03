package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        list();
        set();
        map();
    }

    public static void list() {
        ArrayList<String> arrayList = new ArrayList<String>();

        /* add */
        arrayList.add("138");
        arrayList.add("129");
        arrayList.add("143");
        arrayList.add(0, "133");
        arrayList.add(1, "134");

        /* get */
        System.out.println(arrayList.get(0));

        /* size */
        System.out.println(arrayList.size());

        /* contains */
        System.out.println(arrayList.contains("138"));
        System.out.println(arrayList.contains("160"));

        /* remove */
        System.out.println(arrayList.remove("129"));
        System.out.println(arrayList.remove(0));

        System.out.println();
    }

    public static void map() {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        /* put */
        hashMap.put("people", "사람");
        hashMap.put("baseball", "야구");

        /* get */
        System.out.println(hashMap.get("people"));
        System.out.println(hashMap.get("none"));

        /* containsKey */
        System.out.println(hashMap.containsKey("people"));
        System.out.println(hashMap.containsKey("none"));

        /* remove */
        System.out.println(hashMap.remove("people"));

        /* size */
        System.out.println(hashMap.size());

        /**
         * 입력된 순서대로 데이터를 출력하고 싶을땐 LinkedHashMap 사용
         * Key의 소트 순으로 데이터를 출력하고 싶을땐 TreeMap 사용
         */

        System.out.println();
    }

    public static void set() {
        HashSet<Integer> a = new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        HashSet<Integer> b = new HashSet<Integer>();
        b.add(3);
        b.add(4);
        b.add(5);
        HashSet<Integer> c = new HashSet<Integer>();
        c.add(1);
        c.add(2);

        /* containsAll */
        System.out.println(a.containsAll(b));
        System.out.println(a.containsAll(c));

        /* addAll */
        a.addAll(b);

        /* retainAll */
        a.retainAll(b);

        /* removeAll */
        a.removeAll(b);

        for (Integer integer : a) {
            System.out.println(integer);
        }

        System.out.println();
    }
}











































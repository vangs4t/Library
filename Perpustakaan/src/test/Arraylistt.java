package test;

import java.util.ArrayList;

public class Arraylistt {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<String> match = new ArrayList<>();
        data.add("Dancoy");
        data.add("Dancoq");
        data.add("Dancod");
        System.out.println(data.contains("Dancoy"));
        System.out.println(data.get(1));
        System.out.println(data.stream().toList());

    }
}

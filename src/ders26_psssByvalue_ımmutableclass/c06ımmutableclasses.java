package ders26_psssByvalue_ımmutableclass;

import java.util.ArrayList;
import java.util.List;

public class c06ımmutableclasses {
    public static void main(String[] args) {

        String str="java guzeldır";

        System.out.println(str.toUpperCase());

        System.out.println(str);

        str.toLowerCase();

        System.out.println(str);

        List<String>harfler=new ArrayList<>();

        harfler.add("a");
        harfler.add("b");

        harfler.remove(0);

        System.out.println(harfler);
    }
}

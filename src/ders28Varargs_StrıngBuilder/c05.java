package ders28Varargs_StrıngBuilder;

public class c05 {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("java candır.");

        System.out.println(sb.capacity());

        System.out.println(sb.length());

        System.out.println(sb.reverse());

        sb.reverse();

        sb.replace(0,4,"Ahmet hoca");

        System.out.println(sb);

        sb.insert(18,"Bu bır yalandır");

        System.out.println(sb);

        String str="java cok guzel";

        sb.insert(21,str,9,14);

        System.out.println(sb);



    }
}

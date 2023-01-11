package ders28Varargs_StrıngBuilder;

public class c04StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        System.out.println(sb.capacity());

        System.out.println(sb.length());

        sb.append("java");

        System.out.println(sb);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("guzeldır");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" ona ne suphe");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}

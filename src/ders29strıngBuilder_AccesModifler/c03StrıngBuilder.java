package ders29strıngBuilder_AccesModifler;

public class c03StrıngBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("java ne kadar guzel");

        System.out.println(sb.substring(4));

        System.out.println(sb);

        //sb=sb.substring(0,4); esıtlıgın solu srıng buılder sagı ıse strıng
        //java nun prımıtıv datalarda castıng yapmaz.
        //aynı not ınteger byt ve short gıbı sayı barındırıan nun prımıtıvler ıcınde gecerlıdır


        System.out.println(sb.toString().contains("güzel"));
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);


    }

}

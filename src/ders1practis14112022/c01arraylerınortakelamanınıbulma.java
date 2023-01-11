package ders1practis14112022;

import java.util.ArrayList;

public class c01arraylerınortakelamanınıbulma {
    /*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     *
     */
    public static void main(String[] args) {
        String[] array1 = {"Jhon", "Brad", "Ange", "Sofıa", "Emily"};
        String[] array2 = {"Sofia", "brad", "grace", "emily", "hazel"};
arrylerinOrtakElemanlarıListe(array1,array2);

    }
    private static void arrylerinOrtakElemanlarıListe(String[] array1, String[] array2) {

        ArrayList<String>arrayList=new ArrayList<>();
        for (String each:array1);{
            for (String hıc:array2){

                String each = new String();
                String hic = new String();
                if (each.equalsIgnoreCase(hic)){
                    arrayList.add(hıc);
                }
                System.out.println(arrayList);
            }
        }

    }
}

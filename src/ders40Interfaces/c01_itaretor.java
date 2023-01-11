package ders40Interfaces;

import java.util.ArrayList;
import java.util.List;

public class c01_itaretor {
    public static void main(String[] args) {
         /* Java collection içerisindeki bazı class'lae index desteklemez !
        bu durumda index kullanmadan collection içerisindeki tüm elementlere ulaşabilmek
        ve onları update edebilmek için farklı ihtiyaçlarınız olur.

        List<> index yapısını desteklediği için böyle bir ihtiyaç duymaz
        ANCAK bugünlük index kullanmadan list elementlerine ulaşmaya ve onları update etmeye çalışalım
         */
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);
        sayılar.add(40);

        for (Integer each: sayılar
        ){
            System.out.print(each+" ");
        }
        // İNDEX kullanmadan List'in elementlerini birer arttırın.
        // İNDEX kullanmadan 25'den büyük sayıları List'den silin
for ( Integer each: sayılar
){
    System.out.print(each+1+" ");
}
        System.out.println(" ");
        System.out.print(sayılar);
        for (Integer each: sayılar
        ){
            each+=1;
            System.out.println(each+" ");
        }
        System.out.println(" ");
        System.out.print(sayılar);
    }
    /* Index kullanmadan LİST'in elemanlarını kalıcı olarak değiştirmek mümkün olmadı :/
        Java bunun için Iterator İnterface'i oluşturmuştur.
         */
}

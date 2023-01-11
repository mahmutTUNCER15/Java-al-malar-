package ders17Scope;

import java.util.Scanner;

public class c05ObjektVariables {

    public static void main(String[] args) {
       // c03 clasındakı inteance variablelara nasıl ulasabılrım?
        //istance variablalerın dıger  adı obje variable'lardır
        //istance variala'lere obje uzerınden ulasılır.

        c03Objekvariables pers1=new c03Objekvariables();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYası);

       // pers1.perIsmi="süleyman";
        //pers1.perIsmi="35";
        //pers1.persTelefonu=05554567545;
c03Objekvariables pers2=new c03Objekvariables();
//pers2 persIsmi="latife";
//pers2 persyasi=32;
        System.out.println(pers2.persIsmi);



    }
}

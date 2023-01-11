package ders37Exceptıons;

public class ClasscastExceptıons {
    public static void main(String[] args) {
        short sayı1=23;
        int sayı2=sayı1;

        short sayı3=24;
        //Integer sayı4=sayı3; Integer ve short arasındakı parentchıld ılıskısı olmadıgından bırbırıne atama yapılamaz
        // aralaıda parent chıld ılsıkısı olan clas lardan olussan objelr ıcın
        //outowıdenıng veya excplıcıt marrovıng mumkundıur
        Object obj=sayı3;
        System.out.println("short dan objeye cast edınce:"+obj);

        Integer sayı5=(Integer) obj;
        System.out.println("short datayı obje uzerınden Integere cevırınce :"+sayı5);
//ClassCastException


    }
}

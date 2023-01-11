package ders11stringmanipılation;

public class c04replaceAll {
    public static void main(String[] args) {
        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
     // NOT : space silinmemeli

        String input= "Ja5+va cok 1*guzel";
        input=input.replaceAll("//D","");
        System.out.println(input);

        input=input.replaceAll("//D","");
        System.out.println(input);

        input=input.replaceAll("//d","");
        input=input.replace(" ","5");
        input=input.replaceAll("//W","");
        input=input.replace("5"," ");
        input=input.replaceAll("//s","");
        System.out.println(input);

        System.out.println(input);


    }
}

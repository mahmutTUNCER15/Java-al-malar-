package ders31inharitance;

public class GCorolla extends FToyota{

    String model="corolla";
    String uretımyerı="turkıye";
    GCorolla(){
        super();
        System.out.println("coroola cons. calıstı.");
    }

    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.model);
    }

}

package ders32inheritanceConstractırcall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("parametresız totota constructer");
    }
    BToyota(int pt){
        System.out.println("parametresız toyota constructer");
    }
BToyota(String pt2){
        super("mehmet");
    System.out.println("strıng parametrelı constructer");
}
}

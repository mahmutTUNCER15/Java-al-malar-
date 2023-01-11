package ders32inheritanceConstractırcall;

public class DCamry extends BToyota {
DCamry(String pc){

    super("deniz");

    System.out.println("Strıng parametrelı camry");
}
DCamry(){
}
    public static void main(String[] args) {

        DCamry camry2=new DCamry("celal");

        System.out.println("*************");

        DCamry camry1=new DCamry();
    }
}

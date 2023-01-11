package ders32inheritanceConstractırcall;

public class corolla extends BToyota {

corolla(int pc){
    super(5);
    System.out.println("parametrelı corolla");
}

corolla(){

}
corolla(String str){
    this();

    System.out.println("sıtrıng parametrelı corolla cons");
}
    public static void main(String[] args) {

    corolla corolla3=new corolla("ilker");

        System.out.println("**********");

        corolla corolla1=new corolla(1);

        System.out.println("**********");

        corolla corolla2=new corolla(3);
        }

    }


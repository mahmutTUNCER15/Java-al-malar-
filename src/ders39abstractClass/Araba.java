package ders39abstractClass;

public abstract class Araba {
    // Araba class'ını inherit eden tüm class'lar
    // motor , kasa ve tekerlek metodlarını override etmek zorunda kalsın
    //Ancak abs, klima method'ları opsiyonel olsun
    // isteyen child bu method'ları override etsin isteyen override etmesin

    public abstract void motor();


    public abstract void kasas();


    public abstract void tekerlek();

    public void abs(){
        System.out.println("guvenlık arttırmak isteyen arabalar abs kullanmalı");
    }
    public void klima(){
        System.out.println("konfort arttırmak ısteyen arablar klima kullanmalı");
    }

    }




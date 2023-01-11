package ders40Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface{

    //Eger bir İnterface'i baska bir interface'in child'i yapmak isterseniz
    //extends keyword kullanılır.
    //ınterface ınherıd edılemez

    Void method1();
    //Interface bir child parent Interface'deki abstract merhod'u override edebilir
    //Ama ikisininde body'si olmadığından bu işlemin bir anlamı yoktur.
    int method4();
    boolean method5();

}

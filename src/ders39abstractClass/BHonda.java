package ders39abstractClass;

public abstract class BHonda extends Araba{
 /* Abstract bir klası parent edindiğimizde iki alternatifimiz olur
    1 - Parent'imiz olan abstract class'daki abstract method'ları override etmek
    2 - Proje yapımız gerektiriyorsa bu class'ıda abstract yapmak
     */

public void marka(){
    System.out.println("marha Honda");

}
public abstract void yakıt();

public abstract void güvenlik();

public void özelTeknoloji(){
    System.out.println("tum Honda arabalar vıtec teknolojısı kullanır");
}
}
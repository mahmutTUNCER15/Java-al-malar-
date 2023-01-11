package ders25_staticKeyword;

public class AHemşire {
    static String hastaneIsmı="yıldızhastanesi";

    static String hastaneAdresi="cankaya/Anakara";
    static String basHekımismı="dr mehmet yılmaz";

    String personelismi="ısım belırtılmedı";
    String personelAdresi="adres belırtılmdı";
    String personeltelefonu="telefon belırtılmedı";

    @Override
    public String toString() {
        return "AHemşire{" +
                "personelismi='" + personelismi+ '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personeltelefonu='" + personeltelefonu + '\'' +
                ", hastaneismi='" + hastaneIsmı + '\'' +
                ", hastaneadresi='" + hastaneAdresi + '\'' +
                ", bashekımismi='" + basHekımismı + '\'' +
                '}';
    }
}

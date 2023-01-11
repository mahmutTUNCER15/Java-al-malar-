package ders44Maps;
import java.util.*;

public class MapDepo {
    // ogrenci map olusturup bize donduren bir method olusturun
    public static Map<Integer, String> ornekMapOlustur(){
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");
        return ogrenciMap;
    }
    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {
        String ogrenciValue= ogrenciMap.get(ogrenciKey); // "Ayse-Cem-11-M-TM"
        String[] valueArr=ogrenciValue.split("-"); // [Ayse, Cem, 11, M, TM]
        String isimSoyisim= valueArr[0]+" "+valueArr[1]; // Ayse Cem
        return isimSoyisim;
    }
    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {
        // ogrenci key map'de var mi ? 104
        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz
            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]
            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }
        return ogrenciMap;
    }

    public static void subeOgrenciBilgileriniYazdır(Map<Integer, String> ogrenciMap, String subeAdı) {
        Collection <String>valueCollection=ogrenciMap.values();
        System.out.println("isi soyisim sınıf");
        System.out.println("================");
        for (String eachValue:valueCollection
        ){
           String[]alueArr=eachValue.split("-");

        }
    }

    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {
    }

    public static List<String> numaraDegerineGöreListeOluştur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
         Set<Integer> ogrenciKeyseti = ogrenciMap.keySet();

        List<String>isimListesi=new ArrayList<>();
        String value;
        String[]valueArr;
        String istenenİsim;
for (Integer eachKey:ogrenciKeyseti
){
    if (basNo<=eachKey&&eachKey<=bitNo){

       value=ogrenciMap.get(eachKey);
       valueArr=value.split("-");
       istenenİsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

       isimListesi.add(istenenİsim);

    }
}
return isimListesi;
    }

    public static void numaraİsimSıyİsimYazdır(Map<Integer, String> ogrenciMap) {
        Set<Integer>keySeti=ogrenciMap.keySet();
        String value;
        String valueArr;
        for (Integer eachKey:keySeti
        ){
            value=ogrenciMap.get(eachKey);
            valueArr= String.valueOf(value.split("-"));
            //System.out.println(eachKey+" "+valueArr[0]+" "+valueArr[1]);

        }

    }

    public static Set<String> sıralıOgrenciListesiOluştur(Map<Integer, String> ogrenciMapi) {
        Set<String>sıralıOgrenciseti=new TreeSet<>();
        //tum elementlerın key ve value lerıne bırklıte ıhtıyaz oldugundan entreyy kullanın
        Set< Map.Entry<Integer,String>>ogrenciEntreySeti =ogrenciMapi.entrySet();
        //her  bır entreyy elden gecır

        String istenenBilgi;
        String value;
        String[]valueArr;
        for (Map.Entry<Integer,String>eachEntrey:ogrenciEntreySeti
        ){
           value=eachEntrey.getValue();
           valueArr=value.split("-");
           istenenBilgi=valueArr[4]+", "+valueArr[3]+","+
                   valueArr[0]+","+valueArr[1]+","+eachEntrey.getKey();
           sıralıOgrenciseti.add(istenenBilgi);
        }

        return sıralıOgrenciseti;


    }

    public static Map<Integer, String> soyİsimleriBuyukHarfYap(Map<Integer, String> ogrenciMapi) {
        String istenen;
        String value;
        String[] valueArr;
        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMapi.entrySet();
for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
){
    value=eachEntry.getValue();
    valueArr=value.split("-");
    valueArr[0]=valueArr[1].toUpperCase();
    eachEntry.setValue(valueArr[0]+"-"+
            valueArr[1]+"-"+
            valueArr[2]+"-"+
            valueArr[3]+"-"+
            valueArr[4]);



}


        return ogrenciMapi;
    }
}
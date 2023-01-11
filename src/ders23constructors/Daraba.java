package ders23constructors;

public class Daraba {

        //bır proje olusturulurken tum mclas larda maın method olmasına gerek yoktur
        //cogu clas obje olusturularak kullanılmak uzere hazırlanmıs depolardır.
        //bızde bu clası arab objelerı ıcın bır depo olarak dızayn edelım

      String marka="marka belırtılmedı";
      String model="model belırtılmedı";
      String yakıt;
      int yıl;
      int fıyat;

    public Daraba(String marka, String model, String yakıt, int yıl, int fıyat) {
        this.marka = marka;
        this.model = model;
        this.yakıt = yakıt;
        this.yıl = yıl;
        this.fıyat = fıyat;
    }

    public Daraba() {

    }

    @Override
    public String toString() {
        return "Daraba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakıt='" + yakıt + '\'' +
                ", yıl=" + yıl +
                ", fıyat=" + fıyat +
                '}';
    }

    public int maxHız(String yakıt){
        int maxHız=120;

          if (yakıt.equalsIgnoreCase("dizel")){
              maxHız=280;
          } else if (yakıt.equalsIgnoreCase("benzın")) {
              maxHız=230;

          } else if (yakıt.equalsIgnoreCase("elektrık")) {
              maxHız=180;

          }
          return maxHız;
      }
      }






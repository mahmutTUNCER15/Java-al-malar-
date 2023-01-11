package ders20multıdimensionalarrarys;

public class c03MDAEnUzunKelime {
    public static void main(String[] args) {
        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};
        String enUzunKelıme=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j].length()>enUzunKelıme.length()){
                    enUzunKelıme=arr[i][j];
                }

            }
            System.out.println("en uzun kelıme:"+enUzunKelıme);
        }
    }
}

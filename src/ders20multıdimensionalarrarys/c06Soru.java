package ders20multıdimensionalarrarys;

public class c06Soru {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in
        // son elementlerinin toplaminini yazdiran bir method olusturun.

        int[][] arr={{5,7}, {5, 8, 9},{0,1}};
        sonElementlerınıTopla(arr);
    }
    public static void sonElementlerınıTopla(int[][]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i][(arr[i].length-1)];


        }
        System.out.println("inner sarray lerin son elementleriinin toplami:" +toplam);
    }
}

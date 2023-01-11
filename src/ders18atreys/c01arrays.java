package ders18atreys;

public class c01arrays {
    public static void main(String[] args) {

        int []arr1={2,4,6,8,10};

        System.out.println(arr1[2]);
                arr1[3]=20;
        System.out.println(arr1[3]);

        System.out.println(arr1.length);

        System.out.println(arr1[arr1.length-1]);

        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]+" ");

        }
//arr1[5]=35;
    }


}

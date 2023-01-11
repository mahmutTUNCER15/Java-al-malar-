package ders1practis14112022;

import java.util.Arrays;

public class c01arrays2d {
    public static void main(String[] args) {

        char[][]arr=new char[3][4];

        arr[0][0]='A';
        arr[0][1]='B';
        arr[0][2]='C';
        arr[0][3]='D';

        arr[1][0]='E';
        arr[1][1]='F';
        arr[1][2]='G';
        arr[1][3]='H';

        arr[2][0]='I';
        arr[2][1]='J';
        arr[2][2]='K';
        arr[2][3]='L';
        System.out.println(arr[1][2]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i <arr.length ; i++) {
            for (int o = 0; o <arr[i].length ; o++) {

                System.out.println(arr[i][o] );

            }
            
        }
    }
}

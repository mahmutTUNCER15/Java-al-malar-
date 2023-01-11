package ders21arrayslıst;

import java.util.ArrayList;
import java.util.List;

public class c02topluElemanEkleme {
    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>();

        //tum seslı harflerı lısteye ekleyın
        //eklenecek tum elementlerı bır array olarak yazın
        //sonra forlup ıle lıst e ekleyebılırız

        String[]arr={"a","e","ı","o","u"};

        for (int i = 0; i <arr.length ; i++) {

            harfler.add(arr[i]);

        }
        System.out.println(harfler);
    }
}

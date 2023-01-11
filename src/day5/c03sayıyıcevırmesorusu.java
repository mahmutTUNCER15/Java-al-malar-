package day5;

public class c03sayıyıcevırmesorusu {
    public static void main(String[] args) {

        /*
         * Interview questions…
         * write a return method to reverse number
         * Input : 12345 Output : 54321
         */
       int imput=120;
        System.out.println("gırdıgınız sayının ters cevrılmıs halı:"+revesnumber(imput));
       revesnumber(imput);
    }
    public static int revesnumber(int imput) {
        int reversnum = 0;

        while (imput > 0) {

        reversnum = imput%10 + reversnum*10;
        imput = imput / 10;

    }
return reversnum;

    }

}

package ders13_nestedForlupp_metodolusturma;

public class c05nestedForloopüçgen {
    public static void main(String[] args) {
        /*
        nested forlup yaparak asagıda kı seklı hazırkayın
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
               */
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");

        }

    }


}

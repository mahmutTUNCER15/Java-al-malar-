package ders27immutableClass_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class c07_PerriodOf {
    public static void main(String[] args) {
        //dogumunuzdan bugüne ne kadar zaman gecti ?
        LocalDate  buGün=LocalDate.now();

        LocalDate DogumGünü=LocalDate.of(1984,9,15);

        Period GecenSüre=Period.between(DogumGünü,buGün);

        System.out.println(GecenSüre);

        System.out.println(GecenSüre.getYears());

    }
}

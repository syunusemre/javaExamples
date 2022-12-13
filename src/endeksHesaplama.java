import java.util.Scanner;

public class endeksHesaplama{
    public static void main (String[] args){

        double boy, kilo, enks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilo  giriniz: ");
        kilo = inp.nextDouble();


        enks =  kilo/(boy*boy) ;

        System.out.print("Vücut Kitle İndeksiniz : " + enks);

    }


}
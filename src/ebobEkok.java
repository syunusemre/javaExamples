import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int kücüksayi = 1,ekok = 1,ebob = 1;

        System.out.print("1.Sayiyi giriniz : ");
        int sayi1 = giris.nextInt();

        System.out.print("2.Sayiyi giriniz : ");
        int sayi2 = giris.nextInt();

        if (sayi1 < sayi2){
            kücüksayi = sayi1;
        } else if (sayi2 < sayi1) {
            kücüksayi = sayi2;
        } else if (sayi2 == sayi1) {
            System.out.println("Esit olamazlar");
        }
        System.out.println("Iki sayidan kucuk olani " + kücüksayi);
        int a = kücüksayi;
        while (a >=1){
            if (sayi1 % a ==0 && sayi2 % a == 0){
                ebob = a;
                System.out.println("Ebob " + ebob);
                break;

            }a--;

        }

        System.out.println("Ekok " + (sayi1*sayi2)/ebob);


    }
}
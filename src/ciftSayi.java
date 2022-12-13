import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {
        double k,toplam = 0,sonuc,sayac = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
                toplam += + i;
                sayac++;
            }
        }sonuc = toplam/sayac;
        System.out.println("Sonuc : " + sonuc);
    }
}
import java.util.Scanner;

public class basamakToplami{

    public static void main(String[] args) {
        // Bir sayının basamak sayılarının toplamını hesaplayan programı

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen işlem yapmak istdeğiniz sayıyı giriniz : ");
        int sayi = scan.nextInt();
        int sayiTut = sayi;
        int sayiDegeri = 0;
        int toplam = 0;


        while(sayiTut !=0) {
            sayiDegeri = sayiTut % 10;
            toplam += sayiDegeri;
            sayiTut /= 10;
        }

        System.out.print(sayi + " " + "Sayısının basamak toplamı : " + toplam);





    }

}
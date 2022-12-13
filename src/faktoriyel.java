import java.util.Scanner;


public class faktoriyel {
    public static void main(String[] args) {

        int toplam,sayi,sayi1,total=1,total1=1;
        int kombinasyon;
        int total5 = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kombinasyon: ");
        sayi = inp.nextInt();

        System.out.print("İkinci Kombinasyon: ");
        sayi1 = inp.nextInt();

        for (int i = 1; i<= sayi; i++){
            total = total * i;
        }
        for (int i = 1; i<= sayi1; i++){
            total1 = total1 * i;
        }

        kombinasyon = sayi - sayi1;
        for (int i = 1; i<= kombinasyon; i++){
            total5 = total5 * i;
        }

        toplam = total/(total1*total5);



        System.out.println(  ".kombinasyon: " + toplam);


    }
}
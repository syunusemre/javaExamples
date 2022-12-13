import java.util.Scanner;
/**
 * tekSayiGireneKadar
 */
public class tekSayiOrtalama {

    public static void main(String[] args) {
        int m , toplam = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println(" sayi Gir : " );  // kullanıcıdan sayı girilmesi istenir
            m = input.nextInt();
            if ( m % 2 == 0 && m % 4 == 0){  // 4 ve 2 nin katları olan sayılar bulunur

                toplam +=m; // Kullanıcıdan gelen değer çiftse toplama ekler

            }

        } while (m % 2 ==0);  // Tek sayı girilene kadar program çalışır tek sayı girince durur
        System.out.println(" toplam =   " + toplam);


    }
}
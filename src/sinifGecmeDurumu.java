import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, muzik, kimya;
        double toplam;
        int toplamDersSayisi = 0;
        int toplamNot = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if(!(mat <= 0 || mat > 100)) {
            toplamNot += mat;
            toplamDersSayisi++;
        }

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            toplamNot += fizik;
            toplamDersSayisi++;
        }

        System.out.print("Turkce Notunuz:");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            toplamNot += turkce;
            toplamDersSayisi++;
        }

        System.out.print("Muzik Notunuz:");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            toplamNot += muzik;
            toplamDersSayisi++;
        }

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            toplamNot += kimya;
            toplamDersSayisi++;
        }

        toplam = toplamNot / toplamDersSayisi;

        if (toplam <= 55) {
            System.out.println("Sınıfta Kaldınız");
            System.out.print("Ortalamanız: " + toplam);
        }else{
            System.out.println("Sınıfı Gectiniz");
            System.out.print("Ortalamanız: " + toplam);
        }





    }

}
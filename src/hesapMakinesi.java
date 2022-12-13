import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner hesap = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz: ");
        n1 = hesap.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        n2 = hesap.nextInt();

        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Seçiminiz: ");
        select = hesap.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama işlemi: " + (n1 + n2) );
                break;
            case 2:
                System.out.println("Cıkarma işlemi: " + (n1 - n2) );
                break;
            case 3:
                System.out.println("Carpma işlemi: " + (n1 * n2) );
                break;
            case 4:
                System.out.println("Bölme işlemi: " + (n1 / n2) );
                break;
        }
    }
}
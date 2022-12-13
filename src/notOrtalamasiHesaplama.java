import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {

        // değişkenleri oluşturduk
        int turkce, matematik, kimya, fizik, muzik, tarih;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değer alma

        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();

        System.out.print("turkce Notunuz = ");
        turkce = inp.nextInt();

        System.out.print("kimya Notunuz = ");
        kimya = inp.nextInt();

        System.out.print("fizik Notunuz = ");
        fizik = inp.nextInt();

        System.out.print("muzik Notunuz = ");
        muzik = inp.nextInt();

        System.out.print("tarih Notunuz = ");
        tarih = inp.nextInt();

        int toplam = turkce + matematik + kimya + fizik + muzik + tarih;

        double sonuc = toplam / 6;

        System.out.println("Ortalama: " + sonuc);


        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sinifta Kaldi";
        System.out.println(gectiMi);
    }
}


//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
import java.util.Scanner;  // Klavyeden girilen sayı kütüphanesi

public class minMaxDeger {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, n, largestNumber = 0, smallestNumber = 0;
        System.out.print("Klavyeden Bir Sayı Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter'a Basiniz " + i + ". Numara:");
            number = inp.nextInt();
            if (i == 1) {
                largestNumber = number;
                smallestNumber = number;
            } else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else if (number < smallestNumber) {
                    smallestNumber = number;
                }
            }
        }
        System.out.println("En Büyük Sayi: " + largestNumber);
        System.out.println("En Kücük Sayi: " + smallestNumber);
    }
}
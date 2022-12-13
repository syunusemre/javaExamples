import java.util.Scanner;

public class palindromSayi {

    static boolean isPalid(int number){
        int temp = number, rNumber = 0,lNumber;
        while (temp != 0){
            System.out.println("-------------------");
            System.out.println("sayı > " +temp);
            lNumber = temp % 10;
            System.out.println("Son basamak > " +lNumber);
            rNumber =(rNumber * 10 ) + lNumber;
            System.out.println(" Yeni sayı > " +rNumber);
            temp /= 10;
        }
        if (number == rNumber)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayıyı giriniz : "); // bu satılarda ise kullanıcıdan bir sayı girmesi istenir ve cevaba göre palindrom sayı olup olmadığı sorgulanır
        n = input.nextInt();
        System.out.print(isPalid(n) ? n + " sayısı palindrom bir sayıdır." : n + " sayısı palindrom bir sayı değildir."); //

        System.out.println(isPalid(248)); // 248 sayısını direkt olarak palindrom sayı olup olmadığını yorumlar ve ekrana false true ifadelerini yazdırır
    }
}
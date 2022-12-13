import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //klavyeden sayı istenmesi için yeni bir değişken oluşturulur
        int sum = 0;                             // sum değişkeni atanır ve 0 verilir
        System.out.print("Bir Sayi Giriniz: ");  // kullanıcıdan sayı girilmesi istenir
        int number = input.nextInt();            //number değişkeni üzerinden kullanıcıdan alınan değer sorgulanır

        for ( int i = 1; i < number; i++){  //i den başlayıp kullanıcının girdiği sayıya kadar değer döndürülür(kullanıcının girdiği sayıya gelene kadar değer döner)
            if (number%i == 0){             //1 den başlayıp dönen her değer kullanıcının girdiği sayıya bölünür ve kalanı 0 olanlar esas alınır.
                sum += i;                  //yukarıdaki satırda kalanı 0 olan değerler sum değişkeni içine atılır. (sum değişkeni 0'dı ve gelen her yeni değer içine eklenir.)
            }
        }
        if (sum == number){                                         //sum değişkeni içinde bulunan değerin kullanıcının girdiği değerle eşit olup olmadığı sorgulanır. ( eşit olana kadar döner)
            System.out.println(number + " Mükemmel Sayi.");        //eşit olması durumunda mükemmel sayı olmuş olur ve program biter
        } else{                                                     // aksi değer döndürülür
            System.out.println(number + " Mükemmel Sayi Değildir."); //eşit olmaması durumunda for döngüsü bittiği taktirde bu değer döner ve mükemmel sayi değildir yazar
        }

    }
}
/*import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        String usarName, Password;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adınız: ");
        usarName = inp.nextLine();
        System.out.println("Şifreniz : ");
        Password = inp.nextLine();
        if (usarName.equals("yunus") && Password.equals("123456")){
            System.out.println("Giriş Yaptınız! ");
        }else{
            System.out.println("Bilgileriniz Yanlış! ");
        }else ()
    }
}*/
import java.util.Scanner;

public class kullaniciSifreUygulamasi {

    public static void main(String[] args) {

        String userName, passWord,sifirlendirme, newPassword ;
        Scanner input= new Scanner(System.in);
        System.out.print(" Kullanci Adinizi yaziniz  ");
        userName=input.nextLine( );
        System.out.print(" Sifrenizi yaziniz  ");
        passWord=input.nextLine();

        if (userName.equals("patika") && passWord.equals("java") ){
            System.out.println("Giris yaptiniz");

        }
        else{
            System.out.println(" Hatalı şifre girdiniz, yeni şifre belirlemek için \" yes\" istemezseniz \"no\"" );
            sifirlendirme=input.nextLine();
            if (sifirlendirme.equals("no")){
                System.out.println("Sifre Yenilenmedi");
            }
            else if (sifirlendirme.equals("yes")){
                System.out.println("Sifrenizi Yazın: ");
                newPassword=input.nextLine();
                if (newPassword.equals(newPassword)){
                    System.out.println("Şifreniz Başarıyla Yenilendi");

                } else {
                    System.out.println("Hatalı Seçim");
                }
            }
        }
    }

}
import java.util.Scanner;

/**
 * cinZodyagi
 */
public class cinZodyagi {
    public static void main(String[] args) {
        int kalan = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int yil = inp.nextInt();

        kalan = yil % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        if (kalan == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if (kalan == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}


/*import java.util.Scanner;
public class ZodyagHesap {
    public static void main(String[] args) {
        int date;
        String burc = "";
        Scanner scr = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        date = scr.nextInt();
        if (date % 12 == 0){
            burc = "Maymun";
        } else if (date % 12 == 1) {
            burc = "Horoz";
        } else if (date % 12 == 2) {
            burc = "Köpek";
        } else if (date % 12 == 3) {
            burc = "Domuz";
        } else if (date % 12 == 4) {
            burc = "Fare";
        }else if (date % 12 == 5) {
            burc = "Öküz";
        }else if (date % 12 == 6) {
            burc = "Kaplan";
        }else if (date % 12 == 7) {
            burc = "Tavşan";
        }else if (date % 12 == 8) {
            burc = "Ejderha";
        }else if (date % 12 == 9) {
            burc = "Yılan";
        }else if (date % 12 == 10) {
            burc = "At";
        }else if (date % 12 == 11) {
            burc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}*/

/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dYili, kalan;
        System.out.print("Doğum yılınızı giriniz: ");
        dYili = scan.nextInt();
        kalan = dYili % 12;
        System.out.print("Çin Zodyağı Burcunuz: ");
        switch (kalan) {
            case 0 -> System.out.println("Maymun");
            case 1 -> System.out.println("Horoz");
            case 2 -> System.out.println("Köpek");
            case 3 -> System.out.println("Domuz");
            case 4 -> System.out.println("Fare");
            case 5 -> System.out.println("Öküz");
            case 6 -> System.out.println("Kaplan");
            case 7 -> System.out.println("Tavşan");
            case 8 -> System.out.println("Ejderha");
            case 9 -> System.out.println("Yılan");
            case 10 -> System.out.println("At");
            case 11 -> System.out.println("Koyun");
        }
    }
}*/


/**
 * cinZodyagi
 */
/*public class cinZodyagi {
    public static void main(String[] args) {
        int kalan = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int yil = inp.nextInt();
        kalan = yil % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        if (kalan == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        if (kalan == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        if (kalan == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        if (kalan == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        if (kalan == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        if (kalan == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        if (kalan == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        if (kalan == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        if (kalan == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        if (kalan == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        if (kalan == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}*/
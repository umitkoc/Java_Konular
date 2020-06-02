package bagilliste;

import java.util.Scanner;

public class BagilListe {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        List list = new List();
        boolean devam = true;
        System.out.println("1.Dolu mu?:");
        System.out.println("2.Basa Ekle:");
        System.out.println("3.Sona ekle:");
        System.out.println("4.Yazdır:");
        System.out.println("5.Çıkış");

        while (devam) {
            switch (key.nextInt()) {

                case 1:
                    System.out.println("1.Dolu mu?:");
                    System.out.println(list.Dolumu());
                    break;
                case 2:
                    System.out.println("2.Basa Ekle:");
                    list.BasaEkle(key.nextInt());
                    break;
                case 3:
                    System.out.println("3.Sona ekle:");
                     list.SonaEkle(key.nextInt());
                    break;
                case 4:
                    System.out.println("4.Yazdır:");
                    list.Goster();
                    break;
                case 5:
                    System.out.println("Çıkış");
                    devam = false;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız...");
                    break;
            }
        }

    }

}

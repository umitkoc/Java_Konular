package xox_game;

import java.util.Scanner;

class XOX_Game {

    public static void main(String[] args) {
        XOXGame game = new XOXGame();
        game.Play();
    }
}

class XOXGame {

    public void Play() {
        System.out.println("_________________________________________________");
        System.out.println("                                                 ");
        System.out.println("X     X      O O O       X     X                 ");
        System.out.println(" X   X      O     O       X   X                  ");
        System.out.println("   X        O     O         X                    ");
        System.out.println(" X   X      O     O       X   X                  ");
        System.out.println("X     X      O O O       X     X                 ");
        System.out.println("_________________________________________________");

        try (Scanner key = new Scanner(System.in)) {
            boolean devam = true;
            char[][] karakter = new char[3][3];
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    karakter[i][j] = '_';
                }

            }
            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    System.out.print("  " + karakter[i][j] + "|");
                }
                System.out.println("  ");

            }

            while (devam) {

                System.out.print("satır numarası giriniz:");
                int satır = key.nextInt();
                if (satır > 2) {
                    System.err.println("geçersiz tuş");
                    System.err.println("tekrar deneyiniz");

                    continue;
                } else {

                }

                System.out.print("sütun numarası giriniz:");
                int sütun = key.nextInt();
                if (sütun > 2) {
                    System.err.println("geçersiz tuş");

                    continue;
                }
                key.nextLine();
                System.out.print("karakter giriniz X/O:");
                String harf = key.nextLine();
                if (harf.equals("x") || harf.equals("o")) {

                } else {
                    System.err.println("geçersiz karakter");
                    continue;
                }
                karakter[satır][sütun] = harf.charAt(0);

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("  " + karakter[i][j] + "|");

                    }
                    System.out.println("   ");
                }

                int sayaço = 0;
                int sayaç = 0;
                int beraber = 0;
                for (int i = 0; i < 3; i++) {
                    sayaç = 0;
                    sayaço = 0;
                    for (int j = 0; j < 3; j++) {

                        if ((karakter[i][j]) == 'x') {
                            sayaç++;

                        }
                        if ((karakter[i][j]) == 'o') {
                            sayaço++;
                        }
                        if (sayaç == 3) {
                            System.err.println("(x) oyuncu kazandı.");
                            devam = false;

                        }
                        if (sayaço == 3) {
                            System.err.println("(o) oyuncu kazandı.");
                            devam = false;
                        }
                        if ((karakter[i][j]) != '_') {
                            beraber++;

                        }
                        if (beraber == 9) {
                            System.err.println("oyun berabere kaldı.");
                            devam = false;
                        }

                    }

                }
                beraber = 0;

                for (int i = 0; i < 3; i++) {
                    sayaç = 0;
                    sayaço = 0;
                    for (int j = 0; j < 3; j++) {

                        if ((karakter[j][i]) == 'x') {
                            sayaç++;

                        }
                        if ((karakter[j][i]) == 'o') {
                            sayaço++;
                        }
                        if (sayaç == 3) {
                            System.err.println("(x) oyuncu kazandı.");
                            devam = false;

                        }
                        if (sayaço == 3) {
                            System.err.println("(o) oyuncu kazandı.");
                            devam = false;
                        }

                    }

                }
                sayaç = 0;
                sayaço = 0;
                int i = 0;
                int j = 0;
                while (i < 3) {
                    while (j < 3) {

                        if ((karakter[j][i]) == 'x') {
                            sayaç++;

                        }
                        if ((karakter[j][i]) == 'o') {
                            sayaço++;
                        }
                        if (sayaç == 3) {
                            System.err.println("(x) oyuncu kazandı.");
                            devam = false;

                        }
                        if (sayaço == 3) {
                            System.err.println("(o) oyuncu kazandı.");
                            devam = false;
                        }

                        i++;
                        j++;
                    }
                }
                i = 0;
                j = 0;
                sayaç = 0;
                sayaço = 0;
                while (i < 3) {
                    while (j < 3) {

                        if ((karakter[i][j]) == 'x') {
                            sayaç++;

                        }
                        if ((karakter[i][j]) == 'o') {
                            sayaço++;
                        }
                        if (sayaç == 3) {
                            System.err.println("(x) oyuncu kazandı.");
                            devam = false;

                        }
                        if (sayaço == 3) {
                            System.err.println("(o) oyuncu kazandı.");
                            devam = false;
                        }

                        i++;
                        j++;
                    }
                }

            }

            System.out.println("_____________________");

        }
    }
}

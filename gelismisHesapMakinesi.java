import java.util.Scanner;

public class gelismisHesapMakinesi {
    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.print("Sonuç = " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ".sayiyi gririniz:");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.print("Sonuc= " +result);
    }

    static void times() {
        int number, result = 1, i = 1;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.printf(i++ + ". sayiyi giriniz:");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 1) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuc= " +result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        int counter;
        System.out.println("Kac Adet Sayi Gireceksiniz?");
        counter = input.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            number = input.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            if (i != 1 && number == 0) {
                System.out.print("Boleni sifir giremezsiniz");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void pow() {
        int power, sub, i = 1, total = 1, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı Giriniz: ");
        sub = input.nextInt();
        System.out.print("Üssü Giriniz: ");
        power = input.nextInt();
        while (i <= power) {
            total *= sub;
            i++;
        }
        System.out.println("Sonuc= " +total);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int number = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alinacak sayiyi giriniz: ");
        int number = input.nextInt();
        System.out.print("Mod alinacak sayiyi giriniz: ");
        int number2 = input.nextInt();
        int result = number % number2;
        System.out.print("Sonuc:" + result);
    }

    static void dikdortgen() {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenari giriniz:");
        int uzun = input.nextInt();
        System.out.print("Uzun kenari giriniz:");
        int kisa = input.nextInt();
        int cevre = 2 * (uzun + kisa);
        System.out.println("Dikdortgenin Cevresi: " + cevre);
        int alan = (uzun * kisa);
        System.out.println("Dikdortgenin Cevresi: " + alan);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1-Toplama\n" +
                "2-Cikarma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Us alma\n" +
                "6-Factorial Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdortgenin Alanini hesaplama";
        int select;
        do {
            System.out.println(menu);
            System.out.print("Yapmak Istediginiz Islemi Seciniz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}

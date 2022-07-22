import java.util.Scanner;

public class oneri {
    public static void main(String[] args) {

        int sayi;


        Scanner sicak = new Scanner(System.in);

        System.out.println("Hava Sıcaklığı Hangi Aralıkta ?" +
                "\n1-) 5 Dereceden Küçük" +
                "\n2-) 5 Derece ile 15 Derece Arasında" +
                "\n3-) 15 Derece ile 25 Derece Arasında" +
                "\n4-) 25 Dereceden Büyük ");

        System.out.print("Lütfen Sıcaklık Hangi Aralıktaysa O Sayıyı Giriniz: ");
        sayi = sicak.nextInt();

        switch (sayi) {
            case 1:
                System.out.print("Size Tavsiyem: Kayak Yapmak Olacaktır.");
                break;

            case 2:
                System.out.print("Size Tavsiyem: Sinemaya Gitmek Olacaktır.");
                break;

            case 3:
                System.out.print("Size Tavsiyem: Piknik Yapmak Olacaktır.");
                break;

            case 4:
                System.out.print("Size Tavsiyem: Yüzmeye Gitmek Olacaktır");
                break;

            default:
                System.out.print("Lütfen Geçerli Aralıkta Bir Sayı Giriniz...");
        }


    }


}














package Kredi;

import java.util.Scanner;

public class FaizHesabi implements KrediAraYuz {
    Scanner scanner = new Scanner(System.in);
    public int ay;
    public int faiz;
    public double AylikOdeme;
    public double Miktar;
     public int Onay;

     public boolean kabul=true;
    @Override
    public void GetData(int ay, double Miktar) {
            System.out.println("Yatırcağınız Mikari Giriniz: ");
            Miktar=scanner.nextDouble();
            System.out.println("Kilitlenicek Süre");
            ay=scanner.nextInt();
            this.ay=ay;
            this.Miktar=Miktar;
    }

    @Override
    public void OdemeBilgileri() {
        AylikOdeme = (Miktar * faiz) / 100 + (Miktar / ay);
        if (ay >= 48 && ay < 60) {
            faiz = 1;
            System.out.println("Aylik Ödeme: " + AylikOdeme);
        } else if (ay >= 60 && ay < 72) {
            faiz = 2;
            System.out.println("Aylik Ödeme: " + AylikOdeme);
        } else if (ay >= 72 && ay < 84) {
            faiz = 3;
            System.out.println("Aylik Ödeme: " + AylikOdeme);
        } else if (ay >= 84 && ay < 96) {
            faiz = 4;
            System.out.println("Aylik Ödeme: " + AylikOdeme);
        } else if (ay > 96 && ay < 120) {
            faiz = 8;
            System.out.println("Aylik Ödeme: " + AylikOdeme);

        } else {

            kabul=false;
        }
        if (kabul) {
            System.out.println("Onaylıyor musunuz(EVET:1, HAYIR:2)");
            Onay = scanner.nextInt();
            if (Onay == 1)
                System.out.println("Talebiniz onaylandı. İşlem Başarılı");
            else
                System.out.println("İşleminiz İptal Edildi");
        }
        else
            System.out.println("Talep Reddedildi");
    }

}

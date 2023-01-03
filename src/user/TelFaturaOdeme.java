package user;

import java.util.Scanner;

public class TelFaturaOdeme extends IstKartDolum {

    private int TelNo;
    public int YuklenecekTL;
    private int TLOnay;
    Scanner scanner = new Scanner(System.in);

    public void setTelFatura() {
        System.out.println("Lutfen telefon numaranizi girin:");
        TelNo = scanner.nextInt();
        System.out.println("Ne kadar yukleme yapmak istiyorusunuz: ");
        YuklenecekTL = scanner.nextInt();
        System.out.println("Onaylıyor musunuz(EVET:1, HAYIR:2");
        TLOnay = scanner.nextInt();
        if (TLOnay == 1) {
            String s1 = String.format("Telefonunuza %d yukleme yapilmistir.",YuklenecekTL);
        } else
            System.out.println("İşleminiz İptal Edildi!");

    }

    @Override
    void yukle() {
        System.out.println("Yüklendi....");
    }
}

package user;

import java.util.Scanner;

public abstract class IstKartDolum {

    private int istKartID;
    public int yukleme;
    private int yuklemeOnay;
    Scanner scanner = new Scanner(System.in);
    public void setIstKartID(){
        System.out.println("İstanbul kart İD'nizi giriniz:");
        istKartID=scanner.nextInt();
        System.out.println("Ne kadar yukleme yapmak istiyorusunuz: ");
        yukleme=scanner.nextInt();
        System.out.println("Onaylıyor musunuz(EVET:1, HAYIR:2");
        yuklemeOnay=scanner.nextInt();
        if(yuklemeOnay==1){
            String s1 = String.format("Telefonunuza %d yukleme yapilmistir.",yukleme);
        }else
            System.out.println("İşleminiz İptal Edildi!");

    }

    abstract void yukle();
}

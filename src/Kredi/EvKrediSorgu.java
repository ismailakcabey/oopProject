package Kredi;

public class EvKrediSorgu extends Evkredisi implements KrediAraYuz {

    private int gelir;
    private int gider;
    public double Hesap;

    public int Kabul;


    public void HesapEv(){
        System.out.println("Geliriniz: ");
        gelir= scanner.nextInt();
        System.out.println("Gideriniz");
        gider= scanner.nextInt();
        System.out.println("Kabul Ediyor musunuz(EVET:1, HAYIR:2) ");
        Kabul= scanner.nextInt();
    }
    
    public void Sorgu(double AylikOdeme){
        Hesap=gelir-(gider+ AylikOdeme);
            if(Hesap<0){
                System.out.println("Talep Reddedildi");
            }else if(Hesap>0) {
                System.out.println("Talep Kabul Edildi");

            }else {
                    System.out.println("Talep reddedildi");
            }


    }

}

package Kredi;

public class ArabaKrediSorgu extends ArabaKredisi{

    private int gelir;
    private int gider;
    public double Hesap;

    public int Kabul;

    public void HesapCar(){
        System.out.println("Geliriniz: ");
        gelir= scanner.nextInt();
        System.out.println("Gideriniz");
        gider= scanner.nextInt();
        System.out.println("Kabul Ediyor musunuz(EVET:1, HAYIR:2) ");
        Kabul= scanner.nextInt();
    }

    public void SorguCar(double AylikOdeme){
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

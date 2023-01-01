package Kredi;

public class KrediKarti extends ArabaKrediSorgu{

    public int gelir;

    int KartOnay;
    public double Limit;

    public void KartOnay(){
        System.out.println("Aylik Gelirinizi Giriniz:");
        gelir=scanner.nextInt();
        Limit=gelir*2;
        System.out.println("Kredi Limitiniz: "+Limit);
        System.out.println("Onaylıyor musunuz(EVET:1, HAYIR:2");
        KartOnay=scanner.nextInt();
        if(KartOnay==1){
            System.out.println("Kartınız Onaylanmıştır: ");
            System.out.println("Kart Limiti: "+Limit);
        }else
            System.out.println("İşleminiz İptal Edildi!");

    }


}

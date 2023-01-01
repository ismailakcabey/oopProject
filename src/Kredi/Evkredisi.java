package Kredi;

import java.util.Scanner;
public class Evkredisi implements KrediAraYuz {
    public double MiktarEv;


    Scanner scanner = new Scanner(System.in);
    public int ay;
    public int faiz;
    public boolean onay=true;
    public double  AylikOdeme;
    @Override
    public void GetData(int ay,double MiktarEv) {


            System.out.println("Miktari Giriniz:");
            MiktarEv = scanner.nextDouble();
            System.out.println("Vade giriniz: ");
            ay = scanner.nextInt();
            this.ay = ay;
            this.MiktarEv = MiktarEv;

    }

    @Override
    public void OdemeBilgileri(){
        AylikOdeme=(MiktarEv*faiz)/100+(MiktarEv/ay);
        if(ay>48 && ay<60){
            faiz=2;
            System.out.println("Aylik Ödeme: "+AylikOdeme);
        }
        else if(ay>=60&& ay<72){
            faiz=3;
            System.out.println("Aylik Ödeme: "+AylikOdeme);
        }
        else if(ay>=72 && ay<84){
            faiz=4;
            System.out.println("Aylik Ödeme: "+AylikOdeme);
        }
        else if(ay>=84 && ay<96){
            faiz=5;
            System.out.println("Aylik Ödeme: "+AylikOdeme);
        }
        else if(ay>96 && ay<120){
            faiz=6;
            System.out.println("Aylik Ödeme: "+AylikOdeme);

        }else {
            System.out.println("Talep Reddedildi");
            onay=false;
        }

    }
}

package Kredi;

import java.util.Scanner;
public class ArabaKredisi implements KrediAraYuz {
    Scanner scanner = new Scanner(System.in);
    public double MiktarAraba;
     public  int ay;

     public int faiz;
     public double AylikOdemeCar;

     public boolean kabul=true;

    @Override
    public void GetData(int ay,double MiktarAraba ){

            System.out.println("Miktari Giriniz:");
            MiktarAraba = scanner.nextDouble();
            System.out.println("Vade giriniz: ");
            ay = scanner.nextInt();
            this.ay = ay;
            this.MiktarAraba = MiktarAraba;
    }
    @Override
    public void OdemeBilgileri(){
        AylikOdemeCar=(MiktarAraba*faiz)/100+(MiktarAraba/ay);
        if(ay>12 && ay<18){
            faiz=1;
            System.out.println("Aylik Ödeme: "+AylikOdemeCar);
        }
        else if(ay>=18&& ay<24){
            faiz=2;
            System.out.println("Aylik Ödeme: "+AylikOdemeCar);
        }
        else if(ay>=24 && ay<36){
            faiz=3;
            System.out.println("Aylik Ödeme: "+AylikOdemeCar);
        }
        else if(ay>=36 && ay<42){
            faiz=4;
            System.out.println("Aylik Ödeme: "+AylikOdemeCar);
        }
        else if(ay>48 && ay<72){
            faiz=6;
            System.out.println("Aylik Ödeme: "+AylikOdemeCar);

        }else {
            System.out.println("Talep Reddedildi");
            kabul=false;
        }
    }

}

import Kredi.*;
import user.User;
import user.userLogin;

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
         System.out.println("*****ATM'ye Hoşgeldiniz*****");
         Scanner scanner = new Scanner(System.in);
         User objUser = new User();
         userLogin userLoginObj = new userLogin();
         Evkredisi obj = new Evkredisi();

         boolean isUser = false;
         try {
             System.out.println("User bilginiz mevcut mu ? (true/false)");
             isUser = scanner.nextBoolean();
         } catch (Exception e) {
             System.out.println("Sistemde bir hata ile karşılaşıldı...");

         }

         if (isUser) {
             boolean isVerify = userLoginObj.userLogin(objUser.getEmail(), objUser.getPassword());
             System.out.println("user bilgisi : " + isVerify);

             if (!isVerify) {
                 objUser.User();
                 System.out.println("------- user bilgileri setlenen ---------");
                 isVerify = userLoginObj.userLogin(objUser.getEmail(), objUser.getPassword());
                 System.out.println("user bilgisi : " + isVerify);
             }

         } else {
             objUser.User();
         }

         boolean islem = true;
         boolean kontrol = false;
         while (islem) {
             System.out.println("1 - Doviz islemleri ");
             System.out.println("2 - kredi islemleri ");
             System.out.println("3 - hisse islemleri ");
             System.out.println("4 - Telefon Faturası Odeme");
             System.out.println("5 - İstanbul Kart Dolumu");
             System.out.println("6 - Bakiye Sorgulama");
             System.out.println("7 - Cikis ");
             System.out.println("yapmak istediginiz islemi seciniz : ");
             int secim = scanner.nextInt();
             if(secim == 7)islem = false ;
             while (kontrol) {
                 try {
                     secim = scanner.nextInt();
                     kontrol = false;
                 } catch (Exception e) {
                     scanner.nextLine();
                     System.out.println("Sistemde bir hata ile karşılaşıldı...");
                     System.out.println("Lütfen Tekrar Deneyiniz.");
                 }
             }
             switch (secim) {
                 case 1:
                     System.out.println("1 - Dolar");
                     System.out.println("2 - Euro");
                     System.out.println("3 - Geri");

                     switch (secim) {
                         case 1:
                             objUser.dolar();
                             System.out.println("Doların şuanki fiyatı: " + objUser.getDolarPrice());
                             System.out.println("Ne kadar almak istersiniz: ");
                             secim=3;
                             break;
                         case 2:
                             objUser.euro();
                             System.out.println("Euro'nun şuanki fiyatı: " + objUser.getEuro());
                             System.out.println("Ne kadar almak istersiniz: " + objUser.setEuroAmount());
                             secim=3;
                             break;
                     }
                     break;
                 case 2:
                     System.out.println("Lutfen once kart bilgilerinizi giriniz...");
                     KrediKarti nesneKart = new KrediKarti();
                     nesneKart.KartOnay();

                     System.out.println("1 - Araba Kredisi");
                     System.out.println("2 - Ev Kredisi");
                     System.out.println("3 - Ev Kredisi Sogulama");
                     System.out.println("4 - Faiz Hesabi");
                     System.out.println("5 - Geri");
                     switch (secim) {
                         case 1:
                             ArabaKredisi nesneCar = new ArabaKredisi();
                             nesneCar.GetData(nesneCar.ay, nesneCar.MiktarAraba);
                             nesneCar.OdemeBilgileri();
                             if (nesneCar.kabul) {
                                 ArabaKrediSorgu nesneCar2 = new ArabaKrediSorgu();
                                 nesneCar2.HesapCar();
                                 if (nesneCar2.Kabul == 1) {
                                     nesneCar2.SorguCar(nesneCar.AylikOdemeCar);
                                     if (nesneCar2.Hesap > 0) {
                                         System.out.println("Hesabınıza Eklendi: " + nesneCar.MiktarAraba);
                                     }
                                 } else {
                                     System.out.println("İşleminiz iptal edildi");
                                 }
                             }
                             secim = 5;
                             break;
                         case 2:
                             obj.GetData(obj.ay, obj.MiktarEv);
                             obj.OdemeBilgileri();
                             secim = 5;
                             break;
                         case 3:
                             EvKrediSorgu obj2 = new EvKrediSorgu();
                             if (obj.onay) {
                                 obj2.HesapEv();

                                 if (obj2.Kabul == 1) {
                                     obj2.Sorgu(obj.AylikOdeme);
                                     if (obj2.Hesap > 0) {
                                         System.out.println("Hesabınıza Eklendi: " + obj.MiktarEv);
                                     }
                                 } else {
                                     System.out.println("İşleminiz iptal edildi");
                                 }
                             }
                             secim = 5;
                             break;
                         case 4:
                             FaizHesabi Faiznsn = new FaizHesabi();
                             Faiznsn.GetData(Faiznsn.ay, Faiznsn.Miktar);
                             Faiznsn.OdemeBilgileri();
                             secim = 5;
                             break;
                     }
                 case 3:

             }
             System.out.println("yeni islem istiyor musunuz ? ");
             islem = scanner.nextBoolean();
         }
     }
 }
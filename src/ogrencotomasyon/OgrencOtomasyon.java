
package ogrencotomasyon;
import java.util.Scanner;
import java.io.*;


interface üyelik {
    void SetAd(String a);
    void SetSoyad(String a);
    void SetNo(String a);
    void SetFakülte(String a);
    void SetBölüm(String a);
    void SetTc(String a);
    void dosyayaz();
    void dosyaoku();
    String GetAd();
    String GetSoyad();
    String GetNo();
    String GetFakülte();
    String GetBölüm();
    String GetTc();
}


interface ögretimveidari{
    void notGirme();
    void dersProgramiHazirlama();
    void dersOnay();
    void yoklama();
    
}

interface notişlemleri {
    void harfnotuhesapla();
    void harfnotugöster();
    
}

abstract class DersProgramıGör{
     File f = new File("ogrencibilgi.txt");
     BufferedReader bfr;
     String ders="a";

    void DersP(){
        System.out.println("DERS PROGRAMI \n");
         try {
            while(ders!=null){
            this.bfr = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            ders=bfr.readLine();
            if(ders==null)
                break;
            System.out.println(ders);
            System.out.println("\n");
             
         }    
         } catch (FileNotFoundException ex) {
             
         } catch (IOException ex) {
             
         }
    
    }
 
}
abstract class a{
        void  NotG(){}
        
    }

public class OgrencOtomasyon {

    
    public static void main(String[] args) {
        Scanner asb=new Scanner(System.in);
        ogrenci o = new ogrenci();
        ogretim_uyesi oü=new ogretim_uyesi();
        idari_memur im=new idari_memur();
        int q=0,w=0;
        System.out.println("Hosgeldiniz kullanici tipinize göre bir sayi giriniz ");
        System.out.println("Ögrenci girisi icin 1 ");
        System.out.println("Ögretim üyesi  girisi icin 2 ");
        System.out.println("İdari memur girisi icin 3 ");
        System.out.println("Cikmak icin 4   ");
        q=asb.nextInt();
        while(q!=4){
        if(q==1){
            
            System.out.println("Bilgileri göstermek için 1 giriniz");
            System.out.println("Yeni kayıt eklemek için 2 giriniz");
            System.out.println("Harf notu hesaplamak için 3 giriniz");
            System.out.println("Harf notunu görmek için 4 girinizi");
            System.out.println("Notları görmek  için 5 giriniz");
            System.out.println("Başka tip giriş için 6 giriniz");
            w=asb.nextInt();
            if(w==1){
                o.dosyaoku();
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt eklemek için 2 giriniz");
                System.out.println("Harf notu hesaplamak için 3 giriniz");
                System.out.println("Harf notunu görmek için 4 girinizi");
                System.out.println("Notları görmek  için 5 giriniz");
                System.out.println("Başka tip giriş için 6 giriniz");
                w=asb.nextInt();
            }else if(w==2){
                o.dosyayaz();
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt eklemek için 2 giriniz");
                System.out.println("Harf notu hesaplamak için 3 giriniz");
                System.out.println("Harf notunu görmek için 4 girinizi");
                System.out.println("Notları görmek  için 5 giriniz");
                System.out.println("Başka tip giriş için 6 giriniz");
                w=asb.nextInt();
            }else if(w==3){
                o.harfnotuhesapla();
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt eklemek için 2 giriniz");
                System.out.println("Harf notu hesaplamak için 3 giriniz");
                System.out.println("Harf notunu görmek için 4 girinizi");
                System.out.println("Notları görmek  için 5 giriniz");
                System.out.println("Başka tip giriş için 6 giriniz");
                w=asb.nextInt();
            }else if(w==4){
                o.harfnotugöster();
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt eklemek için 2 giriniz");
                System.out.println("Harf notu hesaplamak için 3 giriniz");
                System.out.println("Harf notunu görmek için 4 girinizi");
                System.out.println("Notları görmek  için 5 giriniz");
                System.out.println("Başka tip giriş için 6 giriniz");
                w=asb.nextInt();
            }else if (w==5){
                o.NotG();
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt eklemek için 2 giriniz");
                System.out.println("Harf notu hesaplamak için 3 giriniz");
                System.out.println("Harf notunu görmek için 4 girinizi");
                System.out.println("Notları görmek  için 5 giriniz");
                System.out.println("Başka tip giriş için 6 giriniz");
                w=asb.nextInt();
            }else if(w==6){
                System.out.println("Ögrenci girisi icin 1 ");
                System.out.println("Ögretim üyesi  girisi icin 2 ");
                System.out.println("İdari memur girisi icin 3 ");
                System.out.println("Cikmak icin 4   ");
                q=asb.nextInt();
            }
        }

        else if (q==2){
            
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                w=asb.nextInt();
                if(w==1){
                    oü.dosyaoku();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==2){
                    oü.notGirme();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==3){
                    oü.dersProgramiHazirlama();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==4){
                    oü.dosyayaz();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if (w==5){
                    oü.dersOnay();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==6){
                    oü.yoklama();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Not girme  için 2 giriniz");
                System.out.println("Ders programı hazırlamak için 3 giriniz");
                System.out.println("Yeni kayıt girmek için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama almak için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==7){
                    System.out.println("Ögrenci girisi icin 1 ");
                    System.out.println("Ögretim üyesi  girisi icin 2 ");
                    System.out.println("İdari memur girisi icin 3 ");
                    System.out.println("Cikmak icin 4   ");
                    q=asb.nextInt();
                }
        }else if(q==3){      
                
                System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                w=asb.nextInt();
                if(w==1){
                    im.dosyaoku();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==2){
                    im.dosyayaz();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==3){
                    im.notGirme();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==4){
                    im.dersProgramiHazirlama();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if (w==5){
                    im.dersOnay();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==6){
                    im.yoklama();
                    System.out.println("Bilgileri göstermek için 1 giriniz");
                System.out.println("Yeni kayıt için 2 giriniz");
                System.out.println("Not girmek için 3 giriniz");
                System.out.println("Ders programı hazırlamak için 4 girinizi");
                System.out.println("Ders Onaylamak için 5 giriniz");
                System.out.println("yoklama için 6 giriniz");
                System.out.println("Başka tip üye girişi için 7 giriniz");
                    w=asb.nextInt();
                }else if(w==7){
                    System.out.println("Ögrenci girisi icin 1 ");
                    System.out.println("Ögretim üyesi  girisi icin 2 ");
                    System.out.println("İdari memur girisi icin 3 ");
                    System.out.println("Cikmak icin 4   ");
                    q=asb.nextInt();
                }
        }    
        }
        System.out.println("İyi günler"); 
        }
}


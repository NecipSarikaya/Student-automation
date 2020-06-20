
package ogrencotomasyon;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author NECİP
 */
public class ogretim_uyesi extends a implements üyelik , ögretimveidari {
    String ad,soyad,no,fakülte,bölüm,tc;
    int  fizik,mat;
    Scanner asb =new Scanner(System.in);
    
    
  
    
    
    
    @Override
    public void SetAd(String a) {
        this.ad=a;
    }

    @Override
    public void SetSoyad(String a) {
        this.soyad=a;
    }

    @Override
    public void SetNo(String a) {
        this.no=a;
    }

    @Override
    public void SetFakülte(String a) {
        this.fakülte=a;
    }

    @Override
    public void SetBölüm(String a) {
        this.bölüm=a;
    }

    @Override
    public void SetTc(String a) {
        this.tc=a;
    }

    @Override
    public String GetAd() {
        return this.ad;
    }

    @Override
    public String GetSoyad() {
        return this.soyad;
    }

    @Override
    public String GetNo() {
        return this.no;
    }

    @Override
    public String GetFakülte() {
        return this.fakülte;
    }

    @Override
    public String GetBölüm() {
        return this.bölüm;
    }

    @Override
    public String GetTc() {
        return this.tc;
    }

    @Override
    public void notGirme() {
        int no;
        int[] not={1,2,3};
        String ders;
        File f = new File("Not.txt");
        System.out.println("Notu girilecek öğrencinin numarasını giriniz");
        no=asb.nextInt();
        System.out.println("Notu girilecek dersin adını giriniz");
        ders=asb.next();
        for(int i = 1 ; i < 3 ; i++){
            System.out.println("Lütfen iki adet not giriniz");
            System.out.println(i+". notu giriniz");
            not[i]=asb.nextInt();
        }
        try {
            FileWriter fr = new FileWriter(f,true);
            BufferedWriter bf = new BufferedWriter(fr);
            bf.write(no+" "+ders+" "+not[1]+" "+not[2]);
            bf.newLine();
            bf.flush();
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }
    }

    @Override
    public void dersProgramiHazirlama() {
        File f = new File("DersProgramı.txt");
        int a;
        String ders;
        System.out.println("Günlük Ders Programı Ayarlamaya Hoşgeldiiniz");
        System.out.println("Kaç adet ders girileceğini giriniz");
        a=asb.nextInt();
        for(int i = 0 ; i < a; i++){
            System.out.println("Ders adı giriniz");
            ders=asb.next();
            try {
            FileWriter fr = new FileWriter(f,true);
            BufferedWriter bf = new BufferedWriter(fr);
            bf.write(ders);
            bf.newLine();
            bf.flush();
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }
        }
    }


    @Override
    public void dersOnay() {
    String Bilgiler = "a",onay="Onayla",ret="Ret",asb1=null;
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("DersProgramı.txt"));
            while(Bilgiler !=null){
            Bilgiler=inputStream.readLine();
            if(Bilgiler == null)
                break;
            System.out.println(Bilgiler);
            System.out.println("Dersi onaylıyor musunuz");
            System.out.println("Onaylamak için Onayla , reddetmek için ret yazınız");
            asb1=asb.next();
            if(asb1.equalsIgnoreCase(onay)){
                System.out.println(Bilgiler+" dersi Onaylandı");
            }
            if(asb1.equalsIgnoreCase(ret)){
                System.out.println(Bilgiler +" dersi Reddedildi");
            }
            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }  

    }

    @Override
    public void yoklama() {
        int var=0,yok=0;
        String yoklama="",a="";
        File f = new File("yoklama.txt");
        try{
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw=new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while(!a.equalsIgnoreCase("dur")){
                System.out.println("Dur yazıp yoklama işlemini durdurun okula geldiyse geldi gelmediyse gelmedi yazınız");
                if(a.equalsIgnoreCase("dur"))
                    break;
                a=asb.nextLine();
                bw.write(a);
                bw.newLine();
                bw.flush();  
            }
            while( ! yoklama.equalsIgnoreCase("dur")){
                yoklama=br.readLine();
                if(yoklama.equalsIgnoreCase("geldi"))
                    var++;
                else if (yoklama.equalsIgnoreCase("gelmedi"))
                    yok++;
            }
            System.out.println(var+" gün okula geldi");
            System.out.println(yok+" gün okula gelmedi");
            
        }catch(IOException e){
        }
    }

    @Override
    public void dosyayaz() {
        System.out.println("Adınızı giriniz");
        ad=asb.nextLine();
        SetAd(ad);
        System.out.println("Soyadınızı giriniz");
        soyad=asb.nextLine();
        SetSoyad(soyad);
        System.out.println("no giriniz");
        no=asb.nextLine();
        SetNo(no);
        System.out.println("fakülte adı giriniz");
        fakülte=asb.nextLine();
        SetFakülte(fakülte);
        System.out.println("bölüm adı giriniz");
        bölüm=asb.nextLine();
        SetBölüm(bölüm);
        System.out.println("tc giriniz");
        tc=asb.nextLine();
        SetTc(tc);
        
        File f = new File("ogretimuyesibilgi.txt");
        try {
            FileWriter fr = new FileWriter(f,true);
            BufferedWriter bf = new BufferedWriter(fr);
            bf.write(GetAd()+" "+GetSoyad()+" "+GetNo()+" "+GetFakülte()+" "+GetBölüm()+" "+GetTc() );
            bf.newLine();
            bf.flush();
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
           
        }
    }

    @Override
    public void dosyaoku() {
        String Bilgiler;
        File f = new File("ogretimuyesibilgi.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while ((Bilgiler = br.readLine()) != null)
                System.out.println(Bilgiler);
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }
    
}

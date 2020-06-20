
package ogrencotomasyon;

import java.io.*;
import java.util.Scanner;


public class ogrenci extends a implements üyelik,notişlemleri {
    private String ad,soyad,no,fakülte,bölüm,tc;
    Scanner asb=new Scanner(System.in);
    
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
    public void dosyayaz(){
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
      File f = new File("ogrencibilgi.txt");
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
    public void dosyaoku(){
        String Bilgiler;
        File f = new File("ogrencibilgi.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while ((Bilgiler = br.readLine()) != null)
                System.out.println(Bilgiler);
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void harfnotuhesapla() {
       int no;
        File f = new File("Not.txt");
        File f1=new File("harfnotu.txt");
        System.out.println("Harf notu hesaplanacak öğrencinin numarasını giriniz");
        no=asb.nextInt();
        String a="",b="",c="",d="";
        int num1 = 0,num2=0,num3=0;
        String[] dizi;
        try{
            FileWriter fw=new FileWriter(f1,true);
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while ((a = br.readLine()) != null){
            dizi=a.split(" ");
            if(Integer.parseInt(dizi[0])== no){
                num1=Integer.parseInt(dizi[2])+Integer.parseInt(dizi[3]);
                num1=num1/2;
                if(num1<50){
                System.out.println(dizi[1]+"dersin harf notu ff");
                b="ff";
            }
            else if (num1<60){
                System.out.println(dizi[1]+"dersin harf notu dd");
                b="dd";}
            else if (num1<70){
                System.out.println(dizi[1]+"dersin harf notu cc");
                b="cc";}
            else if(num1<80){
                System.out.println(dizi[1]+"dersin harf notu bb");
                b="bb";}
            else if(num1<90){
                System.out.println(dizi[1]+"dersin harf notu aa");
                b="aa";} 
                bw.write(no+" "+dizi[1]+" "+b);
                bw.newLine();
                bw.flush();
            }
            }
        }catch(Exception e){
            
        } 
    }

    @Override
    public void harfnotugöster() {
        int no;
        String a=" ";
        String[] spl;
        File f = new File("harfnotu.txt");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            System.out.println("Harf notunu görüntülemek istedğiniz öğrencinin numarsını giriniz");
            no=asb.nextInt();
            while ((a = br.readLine()) != null){
                spl=a.split(" ");
                if(Integer.parseInt(spl[0])==no){
                    System.out.println(spl[1]+" dersin harf notu "+spl[2]);
                }
            }
        }catch(Exception e){
            
        }
    }

    @Override
    void NotG() {
        Scanner asb= new Scanner(System.in);
        String a;
        String[] spl;
        int no;
        File f = new File("Not.txt");
        try{
            System.out.println("Notunu görmek istediğiniz ögrencinin numarasını giriniz");
            no=asb.nextInt();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            while ((a = br.readLine()) != null){
                spl=a.split(" ");
                if(Integer.parseInt(spl[0])==no){
                    System.out.println(a);
                }
            }
                
        }
        catch (FileNotFoundException ex) {
                
        }catch (IOException ex) {
        }
    }
    }


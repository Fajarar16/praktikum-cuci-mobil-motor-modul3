package fajar07176_cuci_mobil_motor;

import Entity.*;
import Controller.*;
import java.util.Scanner;

public class Fajar07176_cuci_mobil_motor {
    private static AllObjectModel07176 model07176 = new AllObjectModel07176();
    private static KendaraanController07176 kendaraan07176 = new KendaraanController07176();
    private static Scanner input = new Scanner(System.in);
    
public static void main(String[] args) {
    
    System.out.println("Selamat Datang di tempat cuci motor&mobil");
    int fajar07176_pilih;
    int fajar07176_pil;
    do{
        System.out.println("Pilih Menu :"
                          +"\n1. Input Data"
                          +"\n2. Tampilkan Data"
                          +"\n3. Hapus Data"
                          +"\n4. Update Data"
                          +"\n5. Exit");
        System.out.print("Pilih : ");
        fajar07176_pilih = input.nextInt();
        switch(fajar07176_pilih){
            
                case 1 : System.out.println("1. Data Motor"+"\n2. Data Mobil");
                         System.out.print("Pilih 1/2 : ");
                         fajar07176_pil = input.nextInt();
                         if(fajar07176_pil==1){
                                fajar07176_inputMotor();
                         }else if(fajar07176_pil==2){
                                fajar07176_inputMobil();
                         }else{
                                System.out.println("Pilihan tidak ada");
                         }break;
                case 2 : System.out.println("Tampilan data cuci motor&mobil");
                         fajar07176_view();
                         break;
                case 3 : System.out.println("1. Data Motor"+"\n2. Data Mobil");
                         System.out.print("Pilih 1/2 : ");
                         fajar07176_hapus();
                         break;
                case 4 : fajar07176_update();
                         break;
                }
        }while(fajar07176_pilih!=5);
  }  
    static void fajar07176_inputMotor(){
        System.out.print("Masukan Nomer motor: ");
        String fajar07176_nomormotor = input.next();
        System.out.print("Masukan Pemilik motor: ");
        String fajar07176_pemilikmotor = input.next();
        System.out.print("Masukan Merek motor: ");
        String fajar07176_merekmotor = input.next();
        System.out.print("Masukan warna motor: ");
        String fajar07176_warnamotor = input.next();
        kendaraan07176.insertMotor07176(fajar07176_nomormotor,fajar07176_pemilikmotor,fajar07176_merekmotor,fajar07176_warnamotor);
    }
    static void fajar07176_inputMobil(){
        System.out.println("Masukan Nomer Mobil");
        String fajar07176_nomormobil = input.next();
        System.out.println("Masukan Pemilik Mobil");
        String fajar07176_pemilikmobil = input.next();
        System.out.println("Masukan Merek Mobil");
        String fajar07176_merekmobil = input.next();
        System.out.println("Masukan Warna Mobil");
        String fajar07176_warnamobil = input.next();
        kendaraan07176.insertMobil07176(fajar07176_nomormobil,fajar07176_pemilikmobil,fajar07176_merekmobil,fajar07176_warnamobil);
    }
    static void fajar07176_view(){
        int i = 0;
        int x = 0;
        for (Fajar07176_MobilEntity mobil : kendaraan07176.getDataMobil()) {
            System.out.println("Index ke " + i);
            System.out.println("Nomor Kendaraan : " + mobil.getNomorMobil07176());
            System.out.println("Nama pemilik :    " + mobil.getNamaPemilikMobil07176());
            System.out.println("Merek Mobil : " + mobil.getfajar07176_merekmobil());
            System.out.println("Warna Mobil : " + mobil.getfajar07176_warnamobil());
            i++;
        }
        System.out.println("");
        for (Fajar07176_MotorEntity motor : kendaraan07176.getDataMotor()) {
            System.out.println("Index ke " + x);
            System.out.println("Nomor Kendaraan : " + motor.getNomorkendaraan07176());
            System.out.println("Nama pemilik :    " + motor.getNamaPemilik07176());
            System.out.println("Merek Motor : " + motor.getfajar07176_merekmotor());
            System.out.println("Warna Motor : " + motor.getfajar07176_warnamotor());
            x++;
        }
    }
    static void fajar07176_hapus(){
        int pilih;
        pilih = input.nextInt();
            if(pilih==1){
                String fajar07176_nomormotor;
                System.out.print("Pilih nomer yang dihapus: ");
                fajar07176_nomormotor = input.next();
                for (int i = 0; i < kendaraan07176.jumlahmotor(); i++) {
                    if (fajar07176_nomormotor.equals(kendaraan07176.getDataMotor().get(i).getNomorkendaraan07176())) {
                        kendaraan07176.getDataMotor().remove(i);
                        System.out.println("Data telah terhapus");
                    }
                }
            }else if(pilih==2){
                String fajar07176_nomormobil;
                System.out.print("Pilih nomer yang dihapus: ");
                fajar07176_nomormobil = input.next();
                for (int i = 0; i < kendaraan07176.jumlahmotor(); i++) {
                    if (fajar07176_nomormobil.equals(kendaraan07176.getDataMobil().get(i).getNomorMobil07176())) {
                        kendaraan07176.getDataMobil().remove(i);
                        System.out.println("Data telah terhapus");
                    }
                } 
            }
    }
    static void fajar07176_update(){
        String nomor07176, nama07176, merek07176, warna07176;
        int update;
        fajar07176_view();
        System.out.println("1. Data Mobil\n2. Data Motor");
        System.out.print("Pilih 1/2 : ");
        int pilih = input.nextInt();
        if(pilih==1) {
                try {
                System.out.println("ingin menganti data index ke : ");
                update = input.nextInt();
                kendaraan07176.getDataMobil().get(update);
                System.out.println("Masukkan Nomer: ");
                nomor07176 = input.next();
                kendaraan07176.update(update,"mobil",nomor07176,"nomor");
                System.out.print("Masukan nama: ");
                nama07176 = input.next();
                kendaraan07176.update(update,"mobil",nama07176,"nama");
                System.out.print("Masukan merek: ");
                merek07176 = input.next();
                kendaraan07176.update(update,"mobil",merek07176,"merek");
                System.out.print("Masukan warna: ");
                warna07176 = input.next();
                kendaraan07176.update(update,"mobil",warna07176,"warna");
                } catch (Exception e) {
                    System.out.println("Data Tidak Ada");
                }
        }else if(pilih==2){
                try {    
                System.out.println("ingin menganti data index ke : ");
                update = input.nextInt();
                kendaraan07176.getDataMotor().get(update);
                System.out.println("Masukkan data baru: ");
                System.out.print("Masukan nomor: ");
                nomor07176 = input.next();
                kendaraan07176.update(update,"motor",nomor07176,"nomor");
                System.out.print("Masukan nama: ");
                nama07176 = input.next();
                kendaraan07176.update(update,"motor",nama07176,"nama");
                System.out.print("Masukan merek: ");
                merek07176 = input.next();
                kendaraan07176.update(update,"motor",merek07176,"merek");
                System.out.print("Masukan warna: ");
                warna07176 = input.next();
                kendaraan07176.update(update,"motor",warna07176,"warna");
                } catch (Exception e) {
                    System.out.println("Data Tidak Ada");
                }
        }
    }
}
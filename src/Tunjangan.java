/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deksripsi Program : menampilkan program tunjangan dengan meotede objek 
 */
public class Tunjangan {

    public int gajiPokok,
            tunjangan,
            totalGaji;
    public String status;
    
    public void inputGaji(){
        System.out.println("========Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan : " + " Rp. ");
        Scanner scanner = new Scanner(System.in);
        gajiPokok = scanner.nextInt();
    }
    
    public void cekStatus(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Status Anda?" + "(Menikah/Belum)\t: ");
        status = scanner.next();
        if(status.equals("Menikah")) {
            tunjangan = (int) (0.35 * gajiPokok);
        } else {
            tunjangan = 0;
        }
    }
    
    
    public void hitungTunjangan(){
        totalGaji = gajiPokok + tunjangan;
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id","ID"));
        System.out.print("\n");
        System.out.println("======Hasil Perhitungan Gaji And====== ");
        System.out.println("Gaji Pokok\t\t\t:" + " Rp. " + numberFormat.format(gajiPokok));
        System.out.println("Tunjangan\t\t\t:" + " Rp. " + numberFormat.format(tunjangan));
        System.out.println("Total Gaji\t\t\t:" + " Rp. " + numberFormat.format(totalGaji));
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tunjangan = new Tunjangan();
        tunjangan.inputGaji();
        tunjangan.cekStatus();
        tunjangan.hitungTunjangan();
        System.out.println("Developed by : Diva Sabila Ramadhan");        
    }
    
}

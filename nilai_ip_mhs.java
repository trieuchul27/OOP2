import java.util.Scanner;
  
public class nilai_ip_mhs {
  public static Scanner input = new Scanner(System.in); 
 
  public static void main(String[] args) {
    float ip_mahasiswa = 0, jumlah_ip_mahasiswa = 0, rata_rata = 0;
    int jumlah_mahasiswa = 0, mahasiswa_lulus = 0, mahasiswa_tidak_lulus = 0;
    boolean exit = false;

    System.out.println("\nKASUS NILAI IP MAHASISWA");
    System.out.println("Memeriksa Data Nilai IP Mahasiswa Lulus, Tidak Lulus, dan Rata-rata");
    System.out.println("\n****************************");
    do { 
      System.out.print("Masukkan IP Mahasiswa : ");
      ip_mahasiswa = input.nextFloat();
      if(isWithinRange(ip_mahasiswa, 0f, 4f) == 1) { 
         jumlah_mahasiswa++; 
         if(isWithinRange(ip_mahasiswa, 2.75f, 4f) == 1) { 
           mahasiswa_lulus++; 
         }
         else {
           mahasiswa_tidak_lulus++; 
         }
         jumlah_ip_mahasiswa += ip_mahasiswa; 
       }
       else if (ip_mahasiswa == -999) { 
         exit = true;
       }
    } while (!exit);
 
    System.out.println("\n=\n");
    if (jumlah_mahasiswa > 0) { 
      rata_rata = jumlah_ip_mahasiswa / jumlah_mahasiswa;
      System.out.println("Jumlah Mahasiswa                    : " + jumlah_mahasiswa);
      System.out.println("Jumlah Mahasiswa Lulus (IP >= 2.75) : " + mahasiswa_lulus);
      System.out.println("Jumlah Mahasiswa Tidak Lulus        : " + mahasiswa_tidak_lulus);
      System.out.println("Rata-Rata IP Mahasiswa              : " + rata_rata);
    }
    else { 
      System.out.println("TIDAK ADA DATA");
    }
      System.out.println("\n=\n");
  }
  
  public static int isWithinRange(float x, float min, float max) { 
    byte result = 1;
      if (x < min || x > max) {
        result = 0;
      }
      return result;
  }
}
import java.util.Scanner;

public class Main {
   int isWithinRanger(float x, float min, float max) {
      if (x >= min && x <= max) {
         return 1;
      } else {
         return 0;
      }
   }


   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Main getRange = new Main();
      int check;
      float inputNilai, rata = 0;
      byte maks = 50, n = 1, i = 0, ygLulus = 0, gkLulus = 0;
      float dataNilai[] = new float[maks];

      do {

         System.out.print("masukan nilai mahasiswa ke-"+ n +" : ");
         inputNilai = input.nextFloat();
         //jika inputan user < 0 atau > 4, maka akan diabaikan
         //dan user tetap diminta memasukkan nilai mahasiswa yang sebelumnya tidak valid

         //panggil fungsi isWithinRanger dengan min 0 dan max 4
         //untuk mengetahui inputan user valid terhadap standar IP atau tidak
         if (getRange.isWithinRanger(inputNilai, 0, 4) == 1){
            dataNilai[i] = inputNilai;
            rata += dataNilai[i];

            //panggil fungsi isWithinRanger dengan min 2.75 dan max 4
            //untuk mengetahui IP mahasiswa yang diinput, lulus atau tidak
            if(getRange.isWithinRanger(inputNilai, 2.75f, 4) == 1) {
               ygLulus++;
               System.out.println("LULUS");
            }
            else {
               gkLulus++;
               System.out.println("Tidak LULUS");
            }

            System.out.println(dataNilai[i]);

            i++;
            n++;
         } else System.out.println("nilai tidak valid!!, diabaikan!");


      } while (inputNilai != -999);

      if ((n-1) != 0) {
         System.out.println();
         System.out.println("------------------------------------------");
         System.out.println("Jumlah mahasiswa : " + (n-1));
         System.out.println("Mahasiswa yang lulus : " +  ygLulus);
         System.out.println("Mahasiswa yang tidak lulus : " + gkLulus);
        System.out.format("Rata-rata IP mahasiswa : %.2f%n", rata/(n-1));
      } else {
         System.out.println();
         System.out.println("------------------------------------------");
         System.out.println("Tidak ada data");
      }
   }
}

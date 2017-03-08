import java.util.Scanner;

public class Main {
   public static String warna;
   public static int sisi;

   public static void inputData() {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan warna persegi      : ");
      warna = input.nextLine();
      System.out.print("Masukkan sisi persegi (cm)  : ");
      sisi = input.nextInt();
   }

   public static void main(String[] args) {
      inputData();
      Persegi persegi1 = new Persegi(warna, sisi);
      persegi1.tampilWarna();
      persegi1.hitungKeliling();
      persegi1.hitungLuas();
   }
}

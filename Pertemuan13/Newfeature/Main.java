import java.util.Scanner;

public class Main {
   public static String warna;
   public static int sisi, n;

   public static void inputData() {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan warna persegi      : ");
      warna = input.nextLine();
      System.out.print("Masukkan sisi persegi (cm)  : ");
      sisi = input.nextInt();
      System.out.print("Masukkan banyak persegi : ");
      n = input.nextInt();
   }

   public static void main(String[] args) {
      inputData();

      Kubus<String> kubus1 = new Kubus<String>();
      Segitiga segitiga1 = new Segitiga();
      kubus1.setWarna(warna);
      kubus1.setSisi(sisi);
      System.out.println("\n----------------------------------");
      kubus1.tampilWarna();
      kubus1.hitungKeliling();
      kubus1.hitungLuas();
      kubus1.hitungVolume();
      segitiga1.segitiga(n);
   }
}

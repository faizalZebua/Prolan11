public class Main {
   public static void main(String[] args) {
         Persegi persegi1 = new Persegi();
         //pemberian nilai awal
         persegi1.sisi = 7;

         //keluaran dari method hitung keliling & luas
         System.out.print("Keliling persegi dengan sisi " + persegi1.sisi + " cm :");
         persegi1.hitungKeliling();

         System.out.print("Luas persegi dengan sisi " + persegi1.sisi + " cm     :");
         persegi1.hitungLuas();
   }
}

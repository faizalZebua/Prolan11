public abstract class Persegi {
   //attribute
   public String warna;
   public int sisi, keliling, luas;

   //constructor
   Persegi(String warna, int sisi) {
      this.warna = warna;
      this.sisi = sisi;
   }

   Persegi(){
      this.warna = "Merah";
      this.sisi = 7;
   }

   //method
   protected abstract void tampilWarna();
   protected abstract void hitungKeliling();
   protected abstract void hitungLuas();
}

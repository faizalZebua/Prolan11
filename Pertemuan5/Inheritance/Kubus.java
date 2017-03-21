public class Kubus extends Persegi {
   public int luasPermukaan, volume;

   Kubus(String warna, int sisi) {
      super(warna, sisi);
   }

   @Override
   protected void hitungLuas() {
      this.luasPermukaan = (super.sisi * super.sisi) * 4;
      System.out.println("Luas permukaan kubus dengan sisi " + super.sisi + " cm : " + this.luasPermukaan + " cm2");
   }

   protected void hitungVolume() {
      this.volume = super.sisi * super.sisi * super.sisi;
      System.out.println("Volume kubus dengan sisi " + super.sisi + " cm : " + this.volume + " cm3 ");
   }
}

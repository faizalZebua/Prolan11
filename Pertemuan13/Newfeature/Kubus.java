public class Kubus<tipe> extends Persegi {

  //  Kubus(String warna, int sisi) {
  //     super(warna, sisi);
  //  }

  private int luasPermukaan, keliling, volume, sisi;
  private tipe warna;

  protected int getSisi() {
    return this.sisi;
  }

  protected void setSisi(int arg) {
    this.sisi = arg;
  }

  protected tipe getWarna() {
    return this.warna;
  }

  protected void setWarna(tipe arg) {
    this.warna = arg;
  }

   @Override
   protected void tampilWarna() {
      System.out.println("warna Kubus => " + this.warna);
   }

   @Override
   protected void hitungKeliling() {
      this.keliling = this.sisi * 12;
      System.out.println("Keliling Kubus dengan sisi " + this.sisi + "cm : " + this.keliling + "cm");
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

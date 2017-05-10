import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double operan1, operan2;
        Scanner input = new Scanner(System.in);
        Hitung cal = new Hitung();

        System.out.print("Masukkan operan 1 : ");
        operan1 = input.nextDouble();
        System.out.print("Masukkan operan 2 : ");
        operan2 = input.nextDouble();
        System.out.println("---------------------------------------");

        System.out.println("Tambah : " + cal.hitungTambah(operan1, operan2));
        System.out.println("Kurang : " + cal.hitungKurang(operan1, operan2));
        System.out.println("Kali   : " + cal.hitungKali(operan1, operan2));
        System.out.println("Bagi   : " + cal.hitungBagi(operan1, operan2));
    }
}

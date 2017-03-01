import java.util.Scanner;

public class Output {
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String nama;
		char jenisKelamin;
		String ketJenisKelamin;
		int tinggiBadan;
		boolean menikah;
		String ketMenikah;
		
		System.out.println("\nInput");
		System.out.print("Masukkan nama anda : ");
		nama = input.nextLine();
		System.out.print("Jenis Kelamin : ");
		jenisKelamin = input.next().charAt(0);
		System.out.print("Tinggi badan : ");
		tinggiBadan = input.nextInt();
		System.out.print("Sudah menikah : ");
		menikah = input.nextBoolean();
		
		if (menikah == true) { ketMenikah = "anda sudah menikah";}
		else { ketMenikah = "anda belum menikah";}
		
		switch(jenisKelamin) {
			case 'l' : 
					ketJenisKelamin = "Laki-laki";
						break;
			case 'p' : 
					ketJenisKelamin = "Perempuan"; 
						break;
			default : ketJenisKelamin = "jangan ngarang";
		}
	
		System.out.println("\n-------------------------------\n\n");
		System.out.println("Output");
		System.out.println("nama anda adalah " + nama);
		System.out.println("jenis kelamin anda adalah " + ketJenisKelamin);
		System.out.println("tinggi badan anda adalah " + tinggiBadan + " cm");
		System.out.println(ketMenikah);
    }
}
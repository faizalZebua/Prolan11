import java.util.Scanner;

public class Main {
   public static int pilihanA(int[] array) {
      int maxValue = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] > maxValue) {
               maxValue = array[i];
           }
       }
       return maxValue;
   }

   public static int pilihanB(int[] array) {
       int minValue = array[0];
       for (int i = 1; i < array.length; i++) {
           if (array[i] < minValue) {
               minValue = array[i];
           }
       }
       return minValue;
   }


   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int inputNilai = 1;
      char pilihMethod = 'a';
      byte inputMax, n = 1, i = 0;


      do {
         System.out.print("Masukan banyak data : ");
         inputMax = input.nextByte();

            if (inputMax > 0){
               int dataNilai[] = new int[inputMax];

               do {
                  System.out.print("Pilih method [A= Max / B= Min] : ");
                  pilihMethod = input.next().charAt(0);

                  if (pilihMethod == 'a' || pilihMethod == 'A' || pilihMethod == 'b' || pilihMethod == 'B') {
                     System.out.println("=============================================");
                     do {
                        System.out.print("masukan data ke-"+ n +" : ");
                        inputNilai = input.nextInt();

                        dataNilai[i] = inputNilai;

                        i++;
                        n++;

                        if (n > inputMax) {
                           System.out.println("=============================================");
                           System.out.println("Data maksimum : " + inputMax);
                           if(pilihMethod == 'A' || pilihMethod == 'a') System.out.println("Data terbesar : " + pilihanA(dataNilai));
                           else if (pilihMethod == 'B' || pilihMethod == 'b') System.out.println("Data terkecil : " + pilihanB(dataNilai));
                           else System.out.println("#BOOOM");
                        }
                     } while (n <= inputMax);
                  }

               } while (n <= inputMax);

            } else System.out.println("nilai tidak valid!!, masukkan lagi!\n");

      } while (inputMax <= 0);
   }
}

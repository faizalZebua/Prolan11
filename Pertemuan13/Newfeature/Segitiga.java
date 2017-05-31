public class Segitiga implements SegitigaPsg {
  public void segitiga(int n){
    int i = 1;
    int j = 1;
    while(i <= n){
      while(j <= i){
        System.out.print("[]");
        j++;
      }
      System.out.println();
      j = 1;
      i++;
    }
    int k = n-1;
    i = k;
    while(k >= 1){
      while(i >= j){
        System.out.print("[]");
        i--;
      }
      System.out.println();
      k--;
      i = k;
    }
  }
}

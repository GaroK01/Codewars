 public class Kata{
  public static int[] countBy(int x, int n){
    int Array [] = new int [n];
    for(int i=1;i<=n;i++){
      Array[i-1] = i*x;
    }
    return Array;
  }
}

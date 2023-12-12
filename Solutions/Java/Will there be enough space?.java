 public class Bob {
  public static int enough(int cap, int on, int wait){
  // your code here
    int a = on+wait;
    if(a<=cap){
      return 0;
    }
    else return a-cap;
  }
}

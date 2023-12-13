 public class Solution {
  public static int closeCompare(double a, double b) {
    if(a>b){
    return 1;
  }
  else if(b >a){
    return -1;
  }
  else return 0;
  
    // TODO
  }
  
  public static int closeCompare(double a, double b, double margin) {
      if (margin >= Math.abs(a-b) || a==b){  
    return 0;
  }
    else if(a<b){
      return -1;
    }
    else return 1; // TODO
  }
}

 public class Kata {

  public int min(int[] list) {
    int a=list[0];
    for(int i=0;i<list.length;i++){
      if(a>list[i]){
        a=list[i];
      }
    }
    return a;
  }
  
  public int max(int[] list) {
    int b=list[0];
    for(int i=0;i<list.length;i++){      
      if(b<list[i]){
        b=list[i];
      }
    }
    return b;
  }
}

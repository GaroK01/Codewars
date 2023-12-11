 public class Kata {

  public static String well(String[] x) {
    // TODO
    int a=0;
  for(int i=0;i<x.length;i++){
  if(x[i]=="good"){
    a++;
  }
}
  if(a==1 || a==2){
    return "Publish!";
  }
  else if(a>2){
     return "I smell a series!";
  }
    return "Fail!";

  }

}

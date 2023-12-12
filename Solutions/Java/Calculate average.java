 public class Kata{
  public static double find_average(int[] array){
    double n=0;
    double g=0;
    if(array.length>0){
    for(int i=0;i<array.length;i++){
      n=n+array[i];
  }
      g=n/array.length;
      
    }
    return  g;
//     return 0;
  }
}

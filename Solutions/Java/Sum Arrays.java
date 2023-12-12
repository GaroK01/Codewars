 public class SumArray {

  public static double sum(double[] numbers) {
 double sum=0;
  if(numbers.length==0){
    return 0;
  }
  else{
    for(int i=0;i<numbers.length;i++){
      sum+=numbers[i];
    }
    return sum;
  }
      }
}

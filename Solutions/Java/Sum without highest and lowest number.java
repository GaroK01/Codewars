 public class Kata
{
  public static int sum(int[] numbers)
  {
    int n=0;
    int max=0;
    int min=0;
    int total = 0;
    if (numbers ==null){
      n=0;
    }
    else if(numbers.length == 1 || numbers == null || numbers.length == 0){
      n= 0;
    }
    else{
     max = numbers[0];
       min = numbers[0];
      for (int i =0;i<numbers.length;i++){
       
       total = total + numbers[i];
       if (max < numbers[i]){
         max = numbers[i];
       }
       if (min > numbers[i]){
         min = numbers[i];
       }
     }
      total = total - max - min;
      n = total;
    }
    return n;
  }
}

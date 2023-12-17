 public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    // Your code here
    int n = yourPoints;
    int n1 = classPoints.length+1;
    for(int i=0; i<classPoints.length; i++){
      n = n + classPoints[i];
    }    
    double n2= (int) (n/n1);
    return (yourPoints > n2);
  }
}

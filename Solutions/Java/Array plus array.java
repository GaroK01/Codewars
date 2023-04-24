public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    // arr1 + arr2 is not working...
    int n=0;
    int n1=0;
    int m;
    for(int i=0;i<arr1.length;i++){
      n=n+arr1[i];
    }
    
    for(int i1=0;i1<arr2.length;i1++){
      n1=n1+arr2[i1];
    }
    m=n1+n;
    return m;
//     return n;
  }

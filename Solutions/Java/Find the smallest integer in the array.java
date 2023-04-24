public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      int n=args[0];     
      for(int i=0;i<args.length;i++){
             if(n>args[i]){
               n=args[i];
             }
           }
      return n;
    }
}

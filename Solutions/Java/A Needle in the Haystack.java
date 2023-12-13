 public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    for(int i=0;i<haystack.length;i++){
      if(haystack[i]=="needle"){
        return "found the needle at position "+i;
      }
      else continue;
    }
   return null;
  }
}

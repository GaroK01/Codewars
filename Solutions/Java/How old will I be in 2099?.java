public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    // TODO: your code here
    if(birth > yearTo){
      int n = birth - yearTo;
      if(n==1){
              return "You will be born in "+n+" year.";

      }
      return "You will be born in "+n+" years.";
    }
    else if(birth == yearTo){
      return "You were born this very year!";
    }
    int a=yearTo - birth;
    if(a==1){
      return "You are "+ a +" year old.";
    }
    return "You are "+ a +" years old.";
  }
}

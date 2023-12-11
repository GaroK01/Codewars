public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    // show me the code!
    if(bonus){
      return "£"+salary*10;
    }
    return "£"+Integer.toString(salary);
  }
}

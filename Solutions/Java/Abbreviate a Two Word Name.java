 public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String name1=name.substring(0,1);
    String name2=name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
    name1=name1.toUpperCase();
    name2=name2.toUpperCase();
    return name1+"."+name2;
  }
}

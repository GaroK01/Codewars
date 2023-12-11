import java.lang.StringBuilder;


class Solution{

  static String toCamelCase(String s){
    String a = "";
    boolean space = false;
    
    for(char character : s.toCharArray()){
      if(Character.isLetter(character)){
        if(space == true){
          a+= Character.toUpperCase(character);
          space = false;
        } else {
          a+= character;
        }
      } else {
        space = true;
      }
    }
    return a;
    }
    }

public class Calculate {
  public static String bmi(double weight, double height) {
    double height2 = Math.pow(height,2);
    double bmi=weight/ height2;
    if (bmi <= 18.5){
      return "Underweight";
    } 

else if (bmi <= 25.0){
  return "Normal";
} 

else if (bmi <= 30.0){
  return "Overweight";
}
  

  return "Obese";
 
   
  }
}

import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
                i--;
            }
         
        }
       return listOfNumbers;
    }
}

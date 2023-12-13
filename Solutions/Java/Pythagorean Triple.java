 import java.util.Arrays;

public class PythagoreanTriple {
	
	public int pythagoreanTriple(int[] triple){
		int a=triple[0];
    int b=triple[1];
    int c=triple[2];
    if(Math.pow(c,2)==(Math.pow(b,2)+Math.pow(a,2))){
      return 1;
    }
    else{
      return 0;
    }
	}

	
}

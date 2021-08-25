package operators;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

	    int p = s.nextInt();

	    int t = s.nextInt();

	    Float r = s.nextFloat();

	    Float si = (p*t*r)/100;

	    System.out.printf("%.2f",si);
	}

}

package operators;
import java.util.Scanner;
public class FencingGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

	    int l = s.nextInt();

	    int b = s.nextInt();

	    int r = (2*l)+(2*b);

	    int c = l*b;

	    System.out.println(""+r+"m");

	    System.out.println(""+c+"sqm");
	}

}

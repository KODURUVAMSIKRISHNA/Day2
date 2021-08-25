package operators;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

	    Float a = s.nextFloat();

	    Float b = s.nextFloat();

	    Float c = s.nextFloat();

	    Float d = s.nextFloat();

	    Float e = s.nextFloat();

	    Float t = (a+b+c+d+e);

	    System.out.printf("%.2f",t/5);
	}

}

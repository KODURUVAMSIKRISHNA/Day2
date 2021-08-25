package operators;
import java.util.Scanner;
public class ProductDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("FIRST INTEGER:");
        int a=sc.nextInt();
        System.out.println("SECOND INTEGER:");
        int b=sc.nextInt();
        int c=a*b;
        int d=a/b;
        int e=a%b;
        System.out.println("Pro is:"+c);
        System.out.println("Quo is:"+d);
        System.out.println("Rem is:"+e);
        
	}

}

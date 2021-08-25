package operators;
import java.util.Scanner;
public class SwappingWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("FIRST NUM:");
        int a=sc.nextInt();
        System.out.println("SECOND NUM:");
        int b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
	}

}

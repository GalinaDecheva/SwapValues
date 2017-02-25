import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.print("Enter Value a: ");
		a = input.nextInt();
		
		System.out.print("Enter Value b : ");
		b = input.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Swap a with b = " + a);
		System.out.println("Swap b with a = " + b);
		
		input.close();
	}

}

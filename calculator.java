import java.util.Scanner;
public class calculator {
	public static void main(String [] args) {
		System.out.println("CALCULATOR");
		System.out.println("Select operator: Addition(1),Subtraction(2),Multiplication(3),Division(4)");
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the operation:");
		int operation = sc.nextInt();
		Scanner nm1= new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = nm1.nextInt();
		Scanner nm2= new Scanner(System.in);
		System.out.println("Enter second number:");
		int num2 = nm2.nextInt();
		if (operation== 1) {
			int result= num1 +num2;
			System.out.println("Result is:" +result);
		}
		else if (operation== 2) {
			int result= num1 -num2;
			System.out.println("Result is:" +result);
			
		}
			
		else if (operation== 3) {
			int result= num1 *num2;
			System.out.println("Result is:" +result);
		}
		else if(operation== 4) {
			if(num2!=0) {
			float result= (float)num1 /num2;
			System.out.println("Result is:" +result);
			}
			else {
				System.out.println("Invalid Operation");
			}
		}
		else {
			System.out.println("Invalid Operation");
		}
		}

}

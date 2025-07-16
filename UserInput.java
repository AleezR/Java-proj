import java.util.Scanner;
public class UserInput {
	public static void main (String [] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=num.nextInt();
		System.out.println("selected number is:"+ number);
		for (int i=1;i<number+1;i++) {
			System.out.println("Count is:"+ i);
		}
	}
}

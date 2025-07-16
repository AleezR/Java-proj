import java.util.Scanner;
public class three_numbers {
	public static void main(String [] args) {
		//To find largest of three numbers
		Scanner a= new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = a.nextInt();
		Scanner b= new Scanner(System.in);
		System.out.print("Enter second number:");
		int num2 = b.nextInt();
		Scanner c= new Scanner(System.in);
		System.out.print("Enter third number:");
		int num3 = c.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The largest number is:"+num1);
			}
		else if(num2>num1 && num2>num3) {
			System.out.println("The largest number is:"+num2);
		}
		else {
			System.out.println("The largest number is:"+num3);
		}
		//To select the odd and even numbers
		// Classify even numbers
        System.out.print("Even: ");
        if (num1 % 2 == 0) {
            System.out.print(num1 + " ");
        }
        if (num2 % 2 == 0) {
            System.out.print(num2 + " ");
        }
        if (num3 % 2 == 0) {
            System.out.print(num3 + " ");
        }
        // Classify odd numbers
        System.out.println("Odd: ");
        if (num1 % 2 != 0) {
            System.out.print(num1 + " ");
        }
        if (num2 % 2 != 0) {
            System.out.print(num2 + " ");
        }
        if (num3 % 2 != 0) {
            System.out.print(num3 + " ");
        }

			}
	}

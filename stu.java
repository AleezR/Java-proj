
package labExp;
import java.util.Scanner;
public class stu {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the grade:");
	        int mark = sc.nextInt();

	        if (mark >= 90) {
	            System.out.println("Grade A");
	        } else if (mark >= 75) {
	            System.out.println("Grade B");
	        } else if (mark >= 60) {
	            System.out.println("Grade C");
	        } else if (mark >= 40) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Fail");
	        }
	    }
	}



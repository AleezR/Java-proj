/*PROBLEM STATEMENT
 * Create a java class named student tht stores the details of students including
 -name(string)
 -roll number(int)
 -marks of 3 subjects (int)
  Use a parameterized constructor to initialize all these fields when object is created
  Include calculate average() to calculate the average
 */
import java.util.Scanner;
class Student {
    String name;
    int rollnumber;
    int marks_1;
    int marks_2;
    int marks_3;
Student(String name, int rollnumber, int marks_1, int marks_2, int marks_3) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks_1 = marks_1;
        this.marks_2 = marks_2;
        this.marks_3 = marks_3;
    }

    public void StudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Marks in three subjects: " + marks_1 + " " + marks_2 + " " + marks_3);
    }
	public void calculateAverage() {
		float average = (marks_1 + marks_2 + marks_3) / 3;
    System.out.println("Average Marks: " + average);
}
}

public class studentProg {
    public static void main(String[] args) {
       /*
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollnumber = sc.nextInt();
        System.out.print("Enter marks of subj 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of subj 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of subj 3: ");
        int m3 = sc.nextInt();
*/
        Student s1 = new Student("ria", 66, 54, 54, 54);
        s1.StudentDetails();
        s1.calculateAverage();
    }
}

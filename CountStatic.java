package lab;
class Student{
	String name;
	static int count = 0;
	Student(String name){
		this.name=name;
		count++;
	}
	public static int getStudentCount() {
		return count;
	}
	public void displayDetails() {
		 System.out.println(name);
	}
}
public class CountStatic {
public static void main(String[] args) {
	Student s1 = new Student("Alena");
    Student s2 = new Student("adi");
    Student s3 = new Student("naina");
    int total = Student.getStudentCount();
    System.out.println("Total static count:" + total);
    System.out.println("Students:" + s1 +s2+s3 );
    /*
    s1.displayDetails();
    s2.displayDetails();
    s3.displayDetails();
  */
}
}

package labExp;

class student {
	    String name;
	    int age;
public void studentDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}
public class studentDemo {
public static void main(String [] args) {
	student s1 = new student();
	s1.name= "Aryan";
	s1.age= 22;
	s1.studentDetails();
}
}
package labExp;
import java.util.Scanner;
class Emp {
    String name;
    int age;
    int employeeNumber;
    public void employeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee Number: " + employeeNumber);
    }
}
public class employee {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        e1.name = sc.nextLine();
        System.out.print("Enter age: ");
        e1.age = sc.nextInt();
        System.out.print("Enter employee number: ");
        e1.employeeNumber = sc.nextInt();
        e1.employeeDetails();

        sc.close();
    }
}


import java.util.Scanner;
class Employee 
{
  int empNo;
  String name;
  long phoneNumber;

  public Employee(int empNo, String name, long phoneNumber) 
  {
    this.empNo = empNo;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
}

public class test 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    Employee[] employees = new Employee[5];

    for (int i = 0; i < 5; i++) 
    {
	  System.out.print("Enter employee number: ");
	  int empNo = Integer.parseInt(sc.nextLine());  

	  System.out.print("Enter employee name: ");
	  String name = sc.nextLine();

    System.out.print("Enter employee phone number: ");
    long phoneNumber = Long.parseLong(sc.nextLine());

    employees[i] = new Employee(empNo, name, phoneNumber);
   }

    for (int i = 0; i < 5; i++) 
    {
      Employee employee = employees[i];
      System.out.println("Employee number: " + employee.empNo);
      System.out.println("Employee name: " + employee.name);
      System.out.println("Employee phone number: " + employee.phoneNumber);
      System.out.println();
    }
  }
}

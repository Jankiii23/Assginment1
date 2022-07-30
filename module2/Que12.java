package module2;
class Member
{
	int age;
	String name,address,phone_number;
	double salary;
	
	public void Printsalary()
	{
		System.out.println("the salary is"+salary);
	}
}
class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}

public class Que12 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		
		e1.name ="Sunita";
		e1.phone_number="9087653412";
		e1.age=20;
		e1.address="Rajkot";
		e1.salary=30000;
		e1.specialization="Manger";
		System.out.println("Employee name is "+e1.name);
		System.out.println("Employee Phone Number is "+e1.phone_number);
		System.out.println("Employee age is "+e1.age);
		System.out.println("Employee Address is "+e1.address);
		System.out.println("Employee Salary is "+e1.salary);
		System.out.println("Employee Specilization is "+e1.specialization);
		System.out.println();
		
		Manager m1=new Manager();
		m1.name="Khyati";
		m1.phone_number="7890875678";
		m1.age=32;
		m1.address="Ahmedabad";
		m1.salary=22000;
		m1.department="Marketing";
		System.out.println("Manager name is "+m1.name);
		System.out.println("Manager Phone Number is "+m1.phone_number);
		System.out.println("Manager age is "+m1.age);
		System.out.println("Manager Address is "+m1.address);
		System.out.println("Manager Salary is " +m1.salary);
		System.out.println("Manager Department is "+m1.department);
        		
		
		
		
	}

}

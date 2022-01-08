package oop;

class Member
{
	String name,address;
	int age,pn,salary;
	void printsalary()
	{
		System.out.println("Salary: "+salary);
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
public class B39 
{
	public static void main(String[] args) 
	{
		Employee ob1 = new Employee();
		Manager ob2 = new Manager();
		
		ob1.name="Nidhi";
		ob1.address="Vasna";
		ob1.age=21;
		ob1.pn=123456;
		ob1.salary=10000;
		ob1.specialization="Computers";
		
		ob2.name="Moksh";
		ob2.address="Paldi";
		ob2.age=19;
		ob2.pn=654321;
		ob2.salary=15000;
		ob2.department="Management";
		
		System.out.println("Employee Details:");
		System.out.println("Name: "+ob1.name);
		System.out.println("Address: "+ob1.address);
		System.out.println("Age: "+ob1.age);
		System.out.println("Phone Number: "+ob1.pn);
		System.out.println("Salary: "+ob1.salary);
		System.out.println("Specialisation: "+ob1.specialization);
	
		System.out.println("Manager Details:");
		System.out.println("Name: "+ob2.name);
		System.out.println("Address: "+ob2.address);
		System.out.println("Age: "+ob2.age);
		System.out.println("Phone Number: "+ob2.pn);
		System.out.println("Salary: "+ob2.salary);
		System.out.println("Department: "+ob2.department);
	}
}

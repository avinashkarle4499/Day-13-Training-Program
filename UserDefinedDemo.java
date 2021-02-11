package day13;

import java.util.ArrayList;

class Employee{
	int id ;
	String Name;


	public Employee(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + Name + "]";

	}
}


public class UserDefinedDemo {

	public static void main(String[] args) {

		ArrayList<Employee> Emplist = new ArrayList<Employee>();
		Emplist.add(new Employee(1, "sam"));
		Emplist.add(new Employee(2, "rahul"));
		Emplist.add(new Employee(3, "pant"));

		System.out.println("elements are" + Emplist);

		for(Employee e : Emplist)
		{
			System.out.println(e.id + " " + e.Name);
		}

	}}

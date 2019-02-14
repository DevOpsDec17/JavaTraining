package Basics;

public class MainEmployee {

	public static void main(String[] args) {


		EmployeeClass lakshmy = new EmployeeClass();
		lakshmy.bonus = 4000;
		lakshmy.salary = 60000;
		
		if (lakshmy.salary > 50000)
			System.out.println("She's rich");
		else
			lakshmy.calculateSalary();
		
		

	}

}

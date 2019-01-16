package java8.shangGuiGu.java8;

import java8.shangGuiGu2.java8.Employee;

public class FilterEmployeeForSalary implements MyPredicate<Employee> {

	@Override
	public boolean test(Employee t) {
		return t.getSalary() >= 5000;
	}

}

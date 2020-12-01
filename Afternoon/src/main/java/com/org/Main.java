
package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setId(102);
		emp.setName("Candy");
		emp.setSalary(56000);
		service.storeEmployee(emp);
	}
}

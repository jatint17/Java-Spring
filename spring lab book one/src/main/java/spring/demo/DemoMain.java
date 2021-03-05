package spring.demo;

import spring.demo.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee details");
		System.out.println("----------------------");
		System.out.println("Employee Id : "+employee.getEmployeeId());
		System.out.println("Employee Name : "+employee.getEmployeeName());
		System.out.println("Employee Salary : "+employee.getSalary());
		System.out.println("Employee BU : "+employee.getBusinessUnit());
		System.out.println("Employee Age : "+employee.getAge());
	}

}

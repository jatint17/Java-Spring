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
		System.out.println("-----------------------");
		System.out.print("Employee "+" [empAge = "+employee.getAge()+" empId = "+employee.getEmployeeId()+
				" empName = "+employee.getEmployeeName()+" empSalary = "+employee.getSalary()+
				" SBU details = "+context.getBean(SBU.class)+"]");


	}

}

package spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		SBU sbu = context.getBean(SBU.class);
		System.out.println("BU details");
		System.out.println("-----------------------\n"+sbu.toString());
	}
}
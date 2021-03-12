package spring.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:employee1.properties")
@ComponentScan("spring.demo")
@Configuration
public class JavaConfig 
{
	@Autowired
	Environment env;
	
	@Bean
	public SBU sbuBean()
	{
		SBU sbu = new SBU();
		Employee emp1 = new Employee();
		int empId1 = env.getProperty("employee1.id",Integer.class);
		emp1.setEmployeeId(empId1);
		String empName1 = env.getProperty("employee1.name",String.class);
		emp1.setEmployeeName(empName1);
		double empSalary1 = env.getProperty("employee1.salary",Double.class);
		emp1.setSalary(empSalary1);
		
		Employee emp2 = new Employee();
		int empId2 = env.getProperty("employee2.id",Integer.class);
		emp2.setEmployeeId(empId2);
		String empName2 = env.getProperty("employee2.name",String.class);
		emp2.setEmployeeName(empName2);
		double empSalary2 = env.getProperty("employee2.salary",Double.class);
		emp2.setSalary(empSalary2);
		List<Employee>empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		sbu.setEmpList(empList);
		return sbu;
	}
	

}
package spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${employee.id}")
	private int employeeId;
	@Value("${employee.name}")
	private String employeeName;
	@Value("${employee.salary}")
	private double salary;
	@Value("${employee.bu}")
	private String businessUnit;
	@Value("${employee.age}")
	private int age;

	public Employee() {}
	
	public Employee(int employeeId,String employeeName,double salary,String businessUnit,int age)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.businessUnit=businessUnit;
		this.age=age;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

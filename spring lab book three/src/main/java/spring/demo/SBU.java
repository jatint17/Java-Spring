package spring.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Value;

public class SBU 
{
	@Value("${sbu.id}")
	private int sbuId;
	@Value("${sbu.name}")
	private String sbuName;
	@Value("${sbu.head}")
	private String sbuHead;

	private List<Employee>empList;

	public SBU() {}
	
	public SBU(int sbuId, String sbuName, String sbuHead)
	{
		this.sbuId=sbuId;
		this.sbuName=sbuName;
		this.sbuHead=sbuHead;
	}
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuHead=" + sbuHead + ", sbuName=" + sbuName +  ", \n"
				+ "Employee Detals:\n-----------------------" + "\nEmployee "+empList + "]";
	}

	
	
}
package week1.day2;

public class EmployeeDetails {
	
	
	public void printEmployeeName (String empName, int empId){
		
		System.out.println(empName);
		System.out.println(empId);
		
	}
	
	public String getEmployeeAddress(){
		String address="Chennai";
		return address;
	}
	
	public double empSalary(){
		double sal=45600.25;
		return sal;
	}
	
	public long empMobileNumber(){
		long phNo=9876543210L;
		return phNo;
	}

	public static void main(String[] args) {
		
		EmployeeDetails ed=new EmployeeDetails();
		ed.printEmployeeName("SangaeswariG", 1233577);
		System.out.println(ed.getEmployeeAddress());
		System.out.println(ed.empSalary());
		System.out.println(ed.empMobileNumber());
		

	}

}

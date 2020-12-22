class Employee{
	int EmpId;
	String EmpName;
	float Sal;
	
	void setDetails() {
		EmpName="Aditya";
		Sal=1100000;
	}
	void getDetails() {
		System.out.println("Name :"+EmpName+" | ID:"+EmpId+" | Sal:"+Sal);
	}
	public static void main(String[] args) {
		System.out.println("Hiiii");
	}
}


class EmplClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.getDetails();
		emp.setDetails();
		emp.getDetails();
		

	}

}


public class EmpClass {

	String EmpName;
	int EmpNo;
	float Sal;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpClass emp= new EmpClass();
		System.out.println(emp.EmpName+" | "+emp.EmpNo+" | "+emp.Sal);
		//System.out.println(EmpClass.EmpName);
		
		emp.EmpNo=123;
		emp.EmpName="Abhishek";
		emp.Sal=2500f;
		System.out.println(emp.EmpName+" | "+emp.EmpNo+" | "+emp.Sal);
	}

}

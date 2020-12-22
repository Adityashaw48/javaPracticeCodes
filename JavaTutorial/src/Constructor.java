
public class Constructor {
	String EmpName;
	int EmpId;

	
	Constructor(){
		EmpName="Aditya";
		EmpId=101;
	}
	void getDetails() {
		System.out.println("Name :"+EmpName+" | ID:"+EmpId);
	}

}


class ConstructorTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor emp=new Constructor();
		Constructor emp2=new Constructor();
		emp.getDetails();
		emp2.getDetails();
		
	}
}
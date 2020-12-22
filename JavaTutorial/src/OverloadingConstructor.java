class Employe{
	String empName;
	int empId;
	float Sal;
	
	Employe(){
	}
	
	//'this' should be used with instance variable
	//'this' keyword is acting as a reference of current object
	Employe(String empName, int empId){
		this.empName=empName;
		this.empId=empId;
	}
	
	Employe(String a, int b, float c){
		/*empName=a;
		empId=b;*/
		this(a,b); //Since this is already defined above, using 'this' key constructor can be called
		//This is called Constructor Chaining
		Sal=c;
	}
	void getDetails() {
		System.out.println("Name: "+this.empName+" | Id:"+this.empId+" | Sal:"+Sal);
	}
}



public class OverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp1=new Employe();
		Employe emp2=new Employe("Aditya",102);
		Employe emp3=new Employe("Aditya",102,110000);
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();

	}

}

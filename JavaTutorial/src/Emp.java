
public class Emp {
	int empNo;
	String Name;
	float Sal;
	
	public Emp(int empNo,String Name,float Sal) {
		this.empNo=empNo;
		this.Name=Name;
		this.Sal=Sal;
		
	}
	@Override //annotation
	public String toString() {
		return "EMP ID:"+empNo+" | Name:"+Name+" |Sal:"+Sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp em=new Emp(11,"Aditya",120f);
		System.out.println(em);//toString() //displays object type with hash code in hexadecimal form
		

	}

}

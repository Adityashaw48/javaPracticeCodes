import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of the Student: ");
		String Name=sc.nextLine();
		
		System.out.println("Enter Number of Subjects: ");
		int n=sc.nextInt();
		int[] marks=new int[n];
		
		for(int i=1;i<n+1;i++) {
			System.out.println("Enter marks of Subject "+i+" :");
			marks[i-1]=sc.nextInt();
		}
		System.out.println("-------------------------------");
		System.out.println("\tREPORT CARD");
		System.out.println("Name : "+Name);
		System.out.println("-------------------------------");
		System.out.println("Subject\t\t\tMarks");
		System.out.println("-------------------------------");
		int sum=0;
		for(int i=1;i<n+1;i++) {
			System.out.println("Subject "+i+"\t\t"+marks[i-1]);
			sum=sum+marks[i-1];
		}
		float avg=sum/n;
		System.out.println("-------------------------------");
		System.out.printf("Total:%d\t Average:%.2f\n",sum,avg);
		System.out.println("-------------------------------");
		sc.close();
	}

}

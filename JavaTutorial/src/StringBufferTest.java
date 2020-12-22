
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer();
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());
		
		sb.append("123456789");
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());

		sb.append("123456789123456789123456789");
		System.out.println(sb+" | Size="+sb.length()+" | Capacity="+sb.capacity());

	}

}

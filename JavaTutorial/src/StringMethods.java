
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aditya";
		System.out.println("length:"+s1.length());
		System.out.println("lowercase:"+s1.toLowerCase());
		System.out.println("uppercase:"+s1.toUpperCase());
		System.out.println("Index of d:"+s1.indexOf('t'));
		
		String str="This is a string array";
		String[] words=str.split(" ");
		System.out.println(words.length);
		for(String word: words) {
			System.out.println(word);
		}
	}

}

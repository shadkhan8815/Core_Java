package in.co.rays.slides;

public class StringFunctions {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		 for (int i = 0; i < name.length(); i++) {

		System.out.println("String Length" + name.length());
		System.out.println("7th character is: " + name.charAt(6));
		System.out.println("dina index is " + name.indexOf("dina"));
		System.out.println("first i position" + name.indexOf("i"));
		System.out.println("a is replaced by b " + name.replace("a","b"));
		System.out.println("chota vijay: " + name.toLowerCase());
		System.out.println("bada vijay: " + name.toUpperCase());
		System.out.println("starts with vijay " + name.startsWith("vijay"));
		System.out.println("end with han " + name.endsWith("han"));
		System.out.println("substring " + name.substring(6));
		
		 }
		StringBuffer sb = new StringBuffer("vijay");

		sb.append("Dinanath Chauhan");

		System.out.println(sb);
		System.out.println("Length " + sb.length());
		System.out.println("capacity " + sb.capacity());
		System.out.println("char at " + sb.charAt(1));
		System.out.println("index of " + sb.indexOf("Chauhan"));
		System.out.println("replace " + sb.replace(0,5,"Jay "));
		System.out.println(sb);
     	System.out.println("reverse " + sb.reverse());

	}
}

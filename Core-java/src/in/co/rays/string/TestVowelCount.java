package in.co.rays.string;

public class TestVowelCount {

	public static void main(String[] args) {
		
		char[] vowel = {'a', 'e','i','o','u'};
		
		String name = "vijay dhinanath chouhan" ;
		
		int count = 0  ;
		
		for (int i = 0; i < vowel.length; i++) {
			
			for (int j = 0; j < name.length(); j++) {
			
				if(vowel[i] == name.charAt(j)) {
					
					count++; 
				}
			}
			 System.out.println(vowel[i] + " count " + count);
			 
		}
		  count = 0;
	}
}

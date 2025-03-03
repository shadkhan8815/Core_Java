package in.co.rays.exceptionhandling;

public class CheckedPropagation {

	public static void main(String[] args) {
		try {
			dad();
		} catch (CustomCheckedException e) {
 			e.printStackTrace();
		}
	}

	public static void dad() throws CustomCheckedException {
		mom();
	}

	public static void mom() throws CustomCheckedException {
		son();
	}

	public static void son() throws CustomCheckedException {

		CustomCheckedException c = new CustomCheckedException();
		
		throw c ;
	}
}

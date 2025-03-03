package in.co.rays.exceptionhandling;

public class UnchekedPropagation {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		mom();
	}

	public static void mom() {
		son();
	}

	public static void son() {

		CustomUnchekedException ce = new CustomUnchekedException();

		throw ce;
	}

}

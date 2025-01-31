package in.co.rays.slides;

public class AllSwitchArgument {

	public static void main(String[] args) {

		int size = args.length;

		switch (size) {
		case 0:
			System.out.println("hello");
			break;

		case 1:
			System.out.println(" world " + args[0]);
			break;

		default:
			for (int i = 0; i < size; i++) {
				System.out.println(i + " = Hello " + args[i]);

			}
		}
	}
}

package in.co.rays.stream;

import java.util.Arrays;

public class TestEven {

		public static void main(String[] args) {

			int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

			Arrays.stream(numbers).filter(e -> e % 2 == 0).forEach(System.out::println);

		}
	}

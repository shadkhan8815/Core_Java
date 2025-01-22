package array;



public class TestArraySecondLargest {

	
public static void main(String[] args) {
	
	
	int array[] = {50, 5, 10, 15, 20,};
	
	
	int highest = 0;
	
	
	int secondhighest = 0;
	
	
	for (int i = 0; i < array.length; i++) {
	
		
		if(array[i] > highest) {
			
			
			secondhighest = highest;
			
			highest = array[i];
			
		}
		
		if(array[i] < highest && array[i] > secondhighest) {
			
			secondhighest = array[i];
			
		}
		
	}
		
		System.out.println("highest:" + highest);
		
		System.out.println("secondhighest:" + secondhighest);
		
		
         	}
	
	
        }	


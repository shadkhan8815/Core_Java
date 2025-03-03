package in.co.rays.comparatorcollections;

import java.util.Comparator;

public class OrderByIdAsc implements Comparator<Employee>  {
                                  // Acending order
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id ;
	}

}

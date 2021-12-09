import java.util.Comparator;

public class sortbyname implements Comparator<Person> {
	public int compare(Person A, Person B) {
		return -(A.LastName.compareTo(B.LastName));
	}
} 



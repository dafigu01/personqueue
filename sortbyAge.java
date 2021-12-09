import java.util.Comparator;

public class sortbyAge implements Comparator<Person> {
	public int compare(Person A, Person B) {
		return -(A.age - B.age);
	}
}
 



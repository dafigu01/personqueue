import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PersonQueue queue = new PersonQueue();
		
		System.out.println("Enter Number of People You Want to Enter: ");
		int numppl = scan.nextInt();
		String FirstName, LastName;
		int age;
		
		for(int i=0; i < numppl; i++) {
			System.out.println();
			System.out.println();
			System.out.println("Enter Details For Person " + (i+1));
			System.out.println("First Name: ");
			FirstName = scan.next();
			System.out.println("Last Name: ");
			LastName = scan.next();
			System.out.println("Age: ");
			age = scan.nextInt();
			
			Person Person = new Person(FirstName, LastName, age);
			
			queue.enqueue(Person);
		}
		queue.sortnew();
		
		
		queue.sortbyname();
		System.out.println();
		System.out.println("Contents of Queue Sorted By Last Name Descending: ");
		queue.printQueue();
		
		
		queue.sortbyAge();
		System.out.println();
		System.out.println("Contents of Queue Sorted By Age Descending: ");
		queue.printQueue();
	}
}

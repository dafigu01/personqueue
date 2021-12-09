import java.util.Arrays;

public class PersonQueue {
	public Person queue[];
	public Person queue1[];
	public int firstidx;
	public int lastidx;
	public int length;
	
	public PersonQueue() {
		this.queue = new Person[15];
		this.firstidx = 0;
		this.lastidx = 0;
		
	}
	public void enqueue(Person Person) {
		
		queue[lastidx] = Person;
		lastidx++;
		
	}
	public void dequeue(Person Person) {
		firstidx++;
		
	}
	public int isEmpty() {
		if(firstidx == lastidx)
			return 1;
		return 0;
	}
	
	public void sortnew() {
		length = lastidx - firstidx;
		queue1 = new Person[length];
		
		for (int i = firstidx; i < lastidx; i++)
			queue1[i] = queue[i];
	}
	public void sortbyname() {
		Arrays.sort(queue1, new sortbyname());
	}
	public void sortbyAge() {
		Arrays.sort(queue1, new sortbyAge());
	}
	public void printQueue() {
		for(int i = 0; i < length; i++) {
			System.out.println(queue1[i].FirstName + ", " + queue1[i].LastName + " " + queue1[i].age);
		}
	}
}

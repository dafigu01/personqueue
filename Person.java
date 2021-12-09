

public class Person {
	
	public String LastName;
	public String FirstName;
	public int age;
	public String Name;
	
	
	public Person() {
		this.LastName = "";
		this.FirstName = "";
		this.age = 0;
	}
	
	public Person (String LastName, String FirstName, int age) {
		this.LastName = LastName;
		this.FirstName = FirstName;
		this.age = age;
	}
	
	public String getName() {
		String getName = "LastName , FirstName";
		Name = LastName + ", " + FirstName;
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name: " + Name + ", Age: " + age;
	}
}





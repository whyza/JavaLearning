package JA04A;

public class Dog implements Comparable<Dog>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Dog dog) {
		// TODO Auto-generated method stub
		if(this.age > dog.age) {
			return 1;
		}else if(this.age == dog.age) {
			return 0;
		}else {
			return -1;
		}
	}
	
}

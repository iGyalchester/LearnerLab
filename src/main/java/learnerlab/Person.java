package learnerlab;

public class Person {

	public final long ID = 0;
	private String name;

	public Person(long id, String name) {
		this.name = name;

	}

	public Person(String name) {
		this.name = name;
	}


	public long getId() {
		return this.ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

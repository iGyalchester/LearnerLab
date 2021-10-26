package learnerlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
	List<Person> personList = new ArrayList<>();

	void add(Person person) {
		this.personList.add(person);
	}

	public void findById(long id) {
		for (Person person : personList) {
			if (id == person.getId()) {
				System.out.println(person);

			}
		}
	}

	public boolean contains(Person person) {
		return personList.contains(person);
	}

	public void remove(Person person) {
		for (Person p : personList) {
			System.out.println(personList.remove(p));
		}
	}

	public void removeId(long id) {
		for (Person p : personList) {
			if (id == p.getId()) {
				System.out.println(personList.remove(p));
			}
		}
	}

	public void removeAll(){
		//faster than ArrayList.removeAll
		personList.clear();
	}

	public void count(){
		System.out.println(personList.size());
	}

	public void toArray(){
		System.out.println(Arrays.toString(personList.toArray()));

	}

	@Override
	public Iterator<Person> iterator() {
		Iterator<Person> it = personList.iterator();
		for (Person person : personList) {
			System.out.println(person);
		}
		return it;
	}
}


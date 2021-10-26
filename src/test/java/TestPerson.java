import learnerlab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

	@Test
	public void testConstructor(){

		Person person = new Person(365486L, "Caleb");
		String expectedName = person.getName();
		long expectedId = person.getId();

		String actualName = person.getName();
		long actualId = person.getId();

		Assert.assertEquals(actualName, actualName);
		Assert.assertEquals(expectedId, actualId);

	}

	@Test
	public void testSetName(){
		Person person = new Person(365486L, "Caleb");
		person.setName("expectedName");

		String actualName = person.getName();
		Assert.assertEquals(actualName, actualName);

	}


}

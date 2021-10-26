import learnerlab.Learner;
import learnerlab.Person;
import learnerlab.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TestStudent {

	@Test
	public void testImplementation() {
		Student student = new Student(6635458L, "Rachid");
		assertThat(student, instanceOf(Learner.class));
	}

	@Test
	public void testInheritance() {
		Student student = new Student(6635458L, "Rachid");
		assertThat(student, instanceOf(Person.class));
	}

	@Test
	public void testLearn() {
		Student student = new Student(6635458L, "Rachid");
		double expected = 60;
		student.learn(30);
		student.learn(30);


		//assert that student learned 25 hours
        Assert.assertEquals(expected, student.getTotalStudyTime(), 1);

	}
}

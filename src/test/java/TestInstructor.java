import learnerlab.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestInstructor {
	@Test
	public void testImplementation(){
		Instructor i = new Instructor(6635458L, "Rachid");
		assertThat(i, instanceOf(Teacher.class));
	}

	@Test
	public void testInheritance(){
		Instructor i = new Instructor(6635458L, "Rachid");
		assertThat(i, instanceOf(Person.class));
	}

	@Test
	public void testTeach (){
		Instructor i = new Instructor(6635458L, "Alonzo");
		Student student = new Student(6635458L, "Rachid");
		double expected = 60;

		i.teach(student, 30);
		i.teach(student, 30);

		assertEquals(expected, student.getTotalStudyTime(), 1);
	}

	@Test
	public void testLecture(){
		Instructor i = new Instructor(6635458L, "Alonzo");
        Student rachid = new Student(6635458L, "Rachid");
		Student edith = new Student(6635458L, "Edith");
		Learner[] students = {rachid, edith};
		double expected = 15;

        i.lecture(students, 30);

		assertEquals(expected, edith.getTotalStudyTime(), 1);
	}

}

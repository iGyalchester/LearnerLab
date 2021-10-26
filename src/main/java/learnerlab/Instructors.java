package learnerlab;

public class Instructors {
	private static final Instructors instructors = new Instructors();

	private Instructors(){}
	public static Instructors getInstance(){
		return instructors;
	}
}

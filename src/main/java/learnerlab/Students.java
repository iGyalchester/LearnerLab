package learnerlab;

public class Students {
	private static Students students;

	private Students() {

	}

	public static synchronized Students getInstance(){
		if(students == null){
			students = new Students();
		}
		return students;
	}

}



package abstraction;

public class SCHOOL2 extends SCHOOL1{

	@Override
	void topperStudents() {
		String studentCategory="Toppers";
		float percentage = 90.00f;
		System.out.println("studentCategory: "+studentCategory+", percentage "+ percentage);
		
	}

	@Override
	void averageStudents() {
		String studentCategory="Average";
		float percentage = 65.00f;
		System.out.println("studentCategory: "+studentCategory+", percentage "+ percentage);
		
		
	}

	@Override
	void slowLearners() {
		String studentCategory="Slow Learners";
		float percentage = 45.00f;
		System.out.println("studentCategory: "+studentCategory+", percentage "+ percentage);
		
		
	}

}

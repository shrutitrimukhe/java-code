package casting;

public class Teacher_Main {

	public static void main(String[] args) {

		Teacher t1 = new JavaTeacher();       //(upcasting)
		
		t1.rollcoll();
		t1.teach();
		
		
		JavaTeacher j1 = (JavaTeacher)new Teacher();
		
		j1.certification();
		j1.rollcoll();
		j1.teach();
		
		System.out.println(".....................");

		
	}

}

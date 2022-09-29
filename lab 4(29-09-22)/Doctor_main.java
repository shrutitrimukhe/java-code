package lab4;

public class Doctor_main {

	public static void main(String[] args) {
		
		

		Doctor d = new Hospital().getDoctor();
		
		Patient p = new Patient("sara", 37);
		
		if(d != null)
		{
			 ((Patient) p).Patient(d);
		}
		else
		{
			System.out.println("Doctor is available");
		}
	}

}

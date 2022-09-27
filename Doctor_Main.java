package casting;

public class Doctor_Main {

	public static void main(String[] args) {
		
		Doctor d1 = new Dermetologist();
		
		d1.appointment();
		d1.availabletime();
		
		if(d1 instanceof Dermetologist)
		{
			((Dermetologist) d1).skinspecialist();
		}
		
		d1 = new Dentist();
		
		d1.appointment();
		d1.availabletime();
		
		if(d1 instanceof Dentist)
		{
			((Dentist) d1).toothspecialist();
		}

				

	}

}

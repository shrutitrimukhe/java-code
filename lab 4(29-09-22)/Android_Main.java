package lab4;

public class Android_Main {
	
	public static void main(String[] args) {
		
		Vivo[] v = new Vivo[2];
		Oppo[] o = new Oppo[3];
		Samsung[] s = new Samsung[2];
		
		v[0]=new Vivo("4GB","Apple Green");
		v[1]=new Vivo("8GB","red");
		
		o[0]= new Oppo("3GB","white");
		o[1]=new Oppo("4GB","Blue");
		o[2]=new Oppo("8GB","Red");
		
		s[0]=new Samsung("4GB","White");
		s[1]=new Samsung("8GB","Red");
		
		System.out.println("Vivo Data:");
		v[0].display();
		v[1].display();
		System.out.println();
		
		System.out.println("Oppo Data");
		o[0].display();
		o[1].display();
		o[2].display();
		System.out.println();
		
		System.out.println("Samsung data");
		s[0].display();
		s[1].display();
		System.out.println();

}

}

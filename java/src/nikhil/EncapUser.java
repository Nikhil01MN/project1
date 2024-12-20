package nikhil;

public class EncapUser {

	public static void main(String[] args) {
		
		Encap e1 = new Encap(10);
		
		System.out.println(e1.getI());
		e1.setI(20);
		System.out.println(e1.getI());
		
		Encap e2 = new Encap(40);
		
		System.out.println(e2.getI());
		e2.setI(60);
		System.out.println(e2.getI());

	}

}

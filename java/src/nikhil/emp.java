package nikhil;

public class emp {
	String name;
	double sal;
	 int id;
	static String s = "TCS";
	 
	 static int count=1;
	 {
		 id = id + count;
		 count++;
		 
	 }
	 
	 
	
	
	public emp(String name,double sal) {
		this.name=name;
		this.sal=sal;
	
	}
	public void display() {
		System.out.println("name is: "+name);
		System.out.println("sal is: "+sal);
		System.out.println("id is: "+s+id);
		System.out.println("");
	}
    
	
}

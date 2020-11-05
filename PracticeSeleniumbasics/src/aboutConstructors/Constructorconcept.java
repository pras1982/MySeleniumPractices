package aboutConstructors;

public class Constructorconcept {

	String name;
	int rollno;
	public Constructorconcept(String name, int rollno) {
		//this.name=name;
		//this.rollno=rollno;
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public Constructorconcept() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {

		Constructorconcept s1 = new Constructorconcept("Prasanna", 101);
		
		/*
		 * System.out.println(s1.name); System.out.println(s1.rollno);
		 * Constructorconcept s2 = new Constructorconcept("Vinayak", 102);
		 * s2.name="Sachin"; s2.rollno = 103; System.out.println(s2.name);
		 */
		//Constructorconcept s3 = new Constructorconcept("Sam", 105);
		//System.out.println(s3.name + " " + s3.rollno);
		Constructorconcept s4 = new Constructorconcept("aaa",666);
		Constructorconcept s5 = new Constructorconcept("SSS", 555);
		s5.name="asdf";
		
		

	}

}

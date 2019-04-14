
public class ComlexNumberTester {
	
	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber(1,2);
		ComplexNumber c2 = new ComplexNumber(3,4);
		ComplexNumber z = new ComplexNumber(0,0);
		
		z = z.add(c1, c2);
		System.out.println("Let c1 = " + c1.getA() + " + " + c1.getB()+ "i" + " and c2 = " + c2.getA() + " + " + c2.getB() + "i");
		System.out.println("The sum of two complex numbers c1 + c2 = " + z.getA() + " + " + z.getB() + "i");
		
		z = z.diff(c1, c2);
		System.out.println("The difference of two complex numbers c1 - c2 = " + z.getA() + " + " + z.getB() + "i");
		
		z = z.div(c1, c2);
		System.out.println("The result of division complexs numbers c1/c2 = " + z.getA() + " + " + z.getB() + "i");
		
		
	}

}

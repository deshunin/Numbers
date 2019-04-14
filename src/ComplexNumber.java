
public class ComplexNumber {
	private double a; // real part
	private double b; // imaginary part

	/**
	 * The constructor generates a complex number (a,b) with parameters
	 * 
	 * @param a number of a double type representing the real part of the complex
	 *          number
	 * @param b number of a double type representing the imaginary part of the
	 *          complex number
	 */
	public ComplexNumber(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * @return the a, the real part of the complex number
	 */
	public double getA() {
		return a;
	}

	/**
	 * @return the b, the imaginary part of the complex number
	 */
	public double getB() {
		return b;
	}

	/**
	 * The method returns the sum of two complex numbers x and y
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public ComplexNumber add(ComplexNumber x, ComplexNumber y) {
		ComplexNumber z = new ComplexNumber(0, 0);
		z.a = x.a + y.a;
		z.b = x.b + y.b;
		return z;
	}

	/**
	 * The method returns the sum of two complex numbers x and y
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public ComplexNumber diff(ComplexNumber x, ComplexNumber y) {
		ComplexNumber z = new ComplexNumber(0, 0);
		z.a = x.a - y.a;
		z.b = x.b - y.b;
		return z;
	}

	/**
	 * The method returns the result of the division of a complex number x by y
	 * 
	 * @param x numerator
	 * @param y denominator
	 * @return
	 */
	public ComplexNumber div(ComplexNumber x, ComplexNumber y) {

		ComplexNumber z = new ComplexNumber(1,1);
		try {
			double den = y.a * y.a + y.b * y.b;
			z.a = (x.a * y.a + x.b * y.b) / den;
			z.b = (x.b * y.a - x.a * y.b) / den;
			return z;
		} catch (ArithmeticException e) {
			System.out.println("The division by zero impossible ");
		}
		return z;
	}
	/**
	 * The method returns the multiplication of two complex numbers x and y 
	 * @param x
	 * @param y
	 * @return
	 */
	public ComplexNumber mult(ComplexNumber x, ComplexNumber y) {
		ComplexNumber z = new ComplexNumber(0,0);
		z.a = x.a * y.a - x.b * y.b;
		z.b = x.a * y.b + x.b * y.a;
		return z;
	}
	
}

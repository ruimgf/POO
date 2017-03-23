package lab3;

public class Complex {
	// diference between final and static
	
	final float a;
	final float b;

	public Complex(float inputA, float inputB){
		a = inputA;
		b = inputB;
	}
	
	public static Complex add(Complex c1, Complex c2){
		float a;
		float b;
		
		a = c1.a + c2.a;
		b = c1.b + c2.b;
		Complex p = new Complex(a,b);
		return p;
	}
	
	public static Complex subtract(Complex c1, Complex c2){
		float a;
		float b;
		
		a = c1.a - c2.a;
		b = c1.b - c2.b;
		Complex p = new Complex(a,b);
		return p;
	}
	
	public static Complex multiply(Complex c1, Complex c2){
		float a;
		float b;
		
		a = c1.a * c2.a - c2.b*c2.b;
		b = c1.b*c2.a + c1.a*c2.b;
		Complex p = new Complex(a,b);
		return p;
	}

	@Override
	public String toString() {
		return "Complex "+ a +"+"+ b + "i";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(a);
		result = prime * result + Float.floatToIntBits(b);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complex other = (Complex) obj;
		if (Float.floatToIntBits(a) != Float.floatToIntBits(other.a))
			return false;
		if (Float.floatToIntBits(b) != Float.floatToIntBits(other.b))
			return false;
		return true;
	}
	
	
	
	
	
	

}

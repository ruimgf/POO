package main;

import lab3.Complex;

public class Main {

	public static void main(String[] args){
		
		Complex c1 = new Complex(1,1);
		Complex c2 = new Complex(1,1);
		
		c1.toString();
		c2.toString();
		System.out.println(c1);
		System.out.println(c2);
	
		Complex cadd = Complex.add(c1, c2);
		Complex csub = Complex.subtract(c1, c2);
		Complex cmul = Complex.multiply(c1, c2);
		
		System.out.println(cadd);
		System.out.println(csub);
		System.out.println(cmul);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
	
	}
	
	
}

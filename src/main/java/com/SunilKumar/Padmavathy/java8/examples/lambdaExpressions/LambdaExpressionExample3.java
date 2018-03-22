package com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions;

public class LambdaExpressionExample3 {
	
	public static void main(String args []) {
		
		Calculator calculator = (x,y)->(x+y);
		System.out.println("result of adding x (10), y(20) inputs is-->"+calculator.calculate(10, 20));
		
		Calculator calculator2 = (int x, int y)->(x+y);
		System.out.println("\nresult of adding int x (10), int y(20) inputs is-->"+calculator2.calculate(10, 20));
		
		Calculator calculator3 = ( x, y)->(x-y);
		System.out.println("\nresult of subtracting  x (10) from  y(20) inputs is-->"+calculator3.calculate(10, 20));
		
		Calculator calculator4 = (x, y) -> {
			return x - y;
		};
		System.out.println("\nresult of subtracting  x (40) from  y(20) inputs using return is-->"+calculator4.calculate(40, 20));
		
		
	}

	
}

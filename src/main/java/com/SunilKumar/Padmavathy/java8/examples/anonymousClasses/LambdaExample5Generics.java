package com.SunilKumar.Padmavathy.java8.examples.anonymousClasses;

import com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions.ProcessInformation;

public class LambdaExample5Generics {

	 static public void main (String generics[]) {
		 
		 ProcessInformation<String, Integer> processInfo = (a,b) -> {
				
				return a+b;
			};
			
			System.out.println("\nLambda with generics example String, Integer\n");
			System.out.println(processInfo.process("Lambda Example # ", 5));
			
			
			 ProcessInformation<Integer, Integer> processInfo2 = (a,b) -> {
					
					return a+b;
				};
			
			System.out.println("\nLambda with generics example Integer(3), Integer(5)\n");
			System.out.println(processInfo2.process(3, 5));
			
			
			
			
	 }
}

package com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions;

public class LambdaExample2FunctionalInterfaceImpl {

	public static void main(String[] args) {
		/**
		 * Java 8 introduces the concept of Functional Interface. An interface with one single abstract method is considered by the compiler
		 * as a functional interface. An annotation @FunctionalInterface is used to represent such interfaces. However, the annotation is optional.
		 * 
		 * Interface Runnable has a single abstract method run(). This interface is a Functional Interface
		 * 
		 * Below is an example of how we can use java lambdas to implement methods of functional interface.
		 * Lambda provides easy way to create anonymous classes during runtime.
		 * 
		 */

		Runnable runnable = () -> System.out.println("implementation of run() method through lambda");
		runnable.run();
		
	}

}

package com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample4ForEach {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();

		cars.add("Honda Civic");
		cars.add("Honda Accord");
		cars.add("Chrysler 300");
		cars.add("Cadillac CT6");
		cars.add("Buick Regal");
		
		System.out.println("Printing the values of a list using forEach and lambda \n");
		
		cars.forEach(car -> System.out.println(car));
		
		System.out.println("\n\n");
		/**
		 * print each element using method reference :: 
		 * Method reference indicates that the println shall be called with a parameter
		 * but we dont need to explicitly mention the parameter.
		 */
		System.out.println("Printing the values of a list using forEach and method reference::  \n");
		
		cars.forEach(System.out::println);
		
		System.out.println("\n\n");

		
		System.out.println("Printing the values of a list if it matches the given string using forEach and lambda \n");
		
		cars.forEach(car -> {
			if (car.equals("Buick Regal")) {
				System.out.println(car);
			}
		});

		System.out.println("\n\n");
		
		System.out.println("sorting using lambda \n");
		
		LambdaExample4ForEach lambdaExample4ForEach = new LambdaExample4ForEach();
		lambdaExample4ForEach.sortCars(cars);
		System.out.println(cars);

	}

	
	private void sortCars(List<String> cars) {
		Collections.sort(cars, (s1, s2) -> s1.compareTo(s2));
	}
}

package com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions;

import java.util.Arrays;

import com.SunilKumar.Padmavathy.java8.examples.anonymousClasses.Car;

public class LambdaExample1 {

	public static void main(String... args) {

		/**
		 * Here we are reusing the implementation from AnonymousClassesExample. Instead
		 * of Car honda = new Car { }; we are just specifying Car honda = () ->{}
		 * 
		 * Car honda = <arguments> <arrow token> <implementation>
		 */
		Car honda = () -> {
			// Here, we don't have any arguments to pass, so it is empty ()
			// Below is the method body

			String[] additionalFeatures = { "Honda Sensing", "One touch power moon roof", "8 way power driver's seat",
					"Multi-Angle Rearview Lamp" };

			String features = Arrays.toString(additionalFeatures);
			return features;

		};

		System.out.println(honda.getAdditionalFeatures());
		System.out.println(honda.getBasicFeatures());

	}
}

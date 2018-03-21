package com.SunilKumar.Padmavathy.java8.examples.anonymousClasses;

import java.util.Arrays;
//@author Sunil Kumar Padmavathy
public class AnonymousClassesExample {
	public static void main(String args[]) {
		// regular class instantiation
		Ferrari ferrari = new Ferrari();

		// get basic features of Ferrari, Car basic features defined in the default
		// method of Car interface, are overridden by Ferrari class
		System.out.println("Basic features of Ferrari -->" + ferrari.getBasicFeatures());

		// get additional features of Ferrari
		System.out.println("\nAdditional features in Ferrari -->" + ferrari.getAdditionalFeatures());

		// Anonymous class
		Car honda = new Car() {

			@Override
			public String getAdditionalFeatures() {
				String[] additionalFeatures = { "Honda Sensing", "One touch power moon roof",
						"8 way power driver's seat", "Multi-Angle Rearview Lamp" };

				String features = Arrays.toString(additionalFeatures);
				return features;

			}

		};

		/*
		 * Notice how a class honda of the Car interface is created in a single line.
		 * The honda variable is an instance of a class(say XYZ) which is created by the
		 * compiler during compilation. This XYZ class extends interface Car. But, in
		 * our code, we have never mentioned the class name XYZ. So, we call such
		 * classes as anonymous classes, as it doesn't have a name. If you are
		 * interested, you can decompile the class file and see that compiler has given
		 * a name to the class. Below is a decompiled code.
		 * 
		 * We use such classes when we need a small functionality without the need for
		 * creation of a separate class file. In real world, usage of such classes much
		 * be a last resort, as the code can turn confusing to any new developer, hence
		 * could reduce re-usability.
		 */

		/*
		 * The below lines are decompiled version of the code. Notice that honda is an
		 * instance of a class AnonymousClassesExample.1 created by compiler. AnonymousClassesExample.1 class name is not
		 * seen or defined by us.
		 * 
		 * Car honda = new AnonymousClassesExample.1();
		 * System.out.println("Basic features of Honda -->" + honda.getBasicFeatures());
		 * System.out.println("Additional features in Honda -->" +
		 * honda.getAdditionalFeatures());
		 * 
		 */

		System.out.println("\nBasic features of Honda -->" + honda.getBasicFeatures());

		System.out.println("\nAdditional features in Honda -->" + honda.getAdditionalFeatures());
	}
}

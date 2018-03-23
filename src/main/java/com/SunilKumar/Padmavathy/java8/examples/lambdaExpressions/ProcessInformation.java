package com.SunilKumar.Padmavathy.java8.examples.lambdaExpressions;

public interface ProcessInformation<T,U> {

	//using generics
	 T process(T t, U u);
	
}

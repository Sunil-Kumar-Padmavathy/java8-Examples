package com.SunilKumar.Padmavathy.java8.examples.anonymousClasses;

import java.util.Arrays;
//@author Sunil Kumar Padmavathy
public class Ferrari
  implements Car
{
  public String getAdditionalFeatures()
  {
    String[] additionalFeatures = { "7-speed automated manual", "V8 cylinders", "Front Head Airbags", "Xenon High Intensity Discharge Headlamp" };
    
    String features = Arrays.toString(additionalFeatures);
    return features;
  }

@Override
public String getBasicFeatures() {
	 String[] basicFeatures = { "4 special Tires", "AC", "High Horse-Power Engine", "Super Accelerator", "Brake" };
	    String features = Arrays.toString(basicFeatures);
	    return features;
}
}

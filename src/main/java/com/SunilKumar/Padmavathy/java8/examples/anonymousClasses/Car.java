package com.SunilKumar.Padmavathy.java8.examples.anonymousClasses;

import java.util.Arrays;
//@author Sunil Kumar Padmavathy
public  interface Car
{
  public static final int doors = 2;
  
  public default String getBasicFeatures()
  {
    String[] basicFeatures = { "4 Tires", "AC", "Engine", "Accelerator", "Brake" };
    
    String features = Arrays.toString(basicFeatures);
    return features;
  }
  
  public abstract String getAdditionalFeatures();
}

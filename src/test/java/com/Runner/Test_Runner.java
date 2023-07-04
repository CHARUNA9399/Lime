package com.Runner;

import org.junit.runner.RunWith;

import com.BaseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(features ="C:\\Users\\sivas\\eclipse-workspace\\LimeRoad\\src\\test\\java\\com\\feature\\Lime\\src\\test\\java\\com\\feature\\limeroad.feature",
glue = "com.Stepdefination")


public class Test_Runner extends BaseClass {
	
	



}


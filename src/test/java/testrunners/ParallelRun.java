package testrunners;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		monochrome = true,
		glue = { "Stepdef" },
		features = { "src/test/features/parallel/" }
)

public class ParallelRun extends AbstractTestNGCucumberTests {

}
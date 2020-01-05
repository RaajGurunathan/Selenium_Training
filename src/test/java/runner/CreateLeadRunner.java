package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature", 
	glue="implementation", 
	monochrome = true)
	//dryRun = true,
	//snippets=SnippetType.CAMELCASE)
public class CreateLeadRunner extends AbstractTestNGCucumberTests{

}

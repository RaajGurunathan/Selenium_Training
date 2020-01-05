package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CreateHooks {
	@Before
	public void preScenario(Scenario s) {
		System.out.println("Test Case Name "+ s.getName());
		System.out.println("The Line Number "+ s.getId());
	}
	@After
	public void afterScenario(Scenario s) {
		System.out.println("The Test Case Status "+ s.getStatus());
		
	}
	
}

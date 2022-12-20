package najah.edu;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FunctionSteps {
	
    Test t = new Test();
    String str;
	@When("we enter the year {string}")
	public void we_enter_the_year(String string) {
	   str = string;
	}

	@Then("then we should {int}")
	public void then_we_should(Integer int1) {
	 Integer n =  t.getYear(str);
	 
	 assertEquals(int1,n );
	}

}

package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= "@remplissage_information_page_signup , @Commander_et_acheter_des_produits",
		
		features="src/test/feature",
		glue={"hooks","stepDefinition"},
		//publish = true,
		plugin= {"pretty"
				,"html:target/cucumber-reports.html"
				,"json:target/cucumber-reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
		
		
		
		

public class runner {

}

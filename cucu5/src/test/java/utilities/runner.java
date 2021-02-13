package utilities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features=".//features/Login.feature",
glue="stepDefinition",
dryRun=false,
monochrome=true,
plugin={"pretty", "html:target/output.html"})
public class runner {

}

package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features_Login", glue ="stepDefinition_Login") // Folder menyimpan feature file
public class TestRunner_Login {

}

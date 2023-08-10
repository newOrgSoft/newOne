package org.example.acceptese;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "cases", // Make sure this is the correct path to your feature files
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        glue = {"acceptance_package"} // Adjust to your actual step definitions package
)
public class acceptTest {
}



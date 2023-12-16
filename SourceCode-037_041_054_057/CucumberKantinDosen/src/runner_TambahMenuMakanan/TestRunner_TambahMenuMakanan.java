package runner_TambahMenuMakanan;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Features_TambahMenuMakanan", glue ="stepDefinition_TambahMenuMakanan") // Folder menyimpan feature file

public class TestRunner_TambahMenuMakanan {

}

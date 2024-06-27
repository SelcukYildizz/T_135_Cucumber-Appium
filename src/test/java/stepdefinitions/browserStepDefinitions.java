package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;

public class browserStepDefinitions {
    @Given("kullanici {string} adresine cep telefonu uzerinden gider")
    public void kullanici_hepsiburada_adresine_cep_telefonu_uzerinden_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
}
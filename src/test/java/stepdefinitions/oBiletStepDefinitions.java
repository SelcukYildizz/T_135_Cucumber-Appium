package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.OBiletPage;
import utils.BrowserDriver;
import utils.ConfigReader;

public class oBiletStepDefinitions {

    OBiletPage page = new OBiletPage();



    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url) {

        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));

    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {

        page.hamburgerMenu.click();
        page.englishButton.click();
        page.turkishLanguage.click();


    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {

        page.hamburgerMenu.click();
        page.currencySelect.click();
        page.turkishLira.click();

    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() throws InterruptedException {

        page.searchButton.click();
        Thread.sleep(5000);

    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {

        String fiyat = page.fiyatTuru.getText();
        Assert.assertTrue(fiyat.contains(" TL"));


    }








}

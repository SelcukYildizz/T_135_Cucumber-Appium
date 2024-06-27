package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Point;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.awt.*;
import java.time.Duration;

public class aileButcemStepDefinitions {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    AileButcemPage page = new AileButcemPage();


    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {

        page.ilkEkranAyarlari();

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String password, String girisYap) {

        page.emailButton.sendKeys(ConfigReader.getProperty(mail));
        page.passwordButton.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);

    }

    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

        Assert.assertTrue(page.girisBasarili.isDisplayed());


    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) throws InterruptedException {

        Thread.sleep(6000);

        page.dortCizgiMenu();
        ReusableMethods.scrollWithUiScrollableAndClick(hesabim);


    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String name, String surname, String city, String age, String job) {

     page.hesapBilgileri(name,surname,city, age, job);

     page.assertionTextBox(name,surname, city, age, job);





 }

    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() throws InterruptedException {

        page.artiButonuTiklama();



    }
    @Given("gelir ekle bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin() {

        page.gelirEkleButtonu.click();




    }
    @Given("gelir ekleme sayfasinda {string} kismina bilgi girilir ve tipi {string} {string} secilir")
    public void gelir_ekleme_sayfasinda_açıklama_kismina_bilgi_girilir_ve_tipi_gelir_tipi_düzensiz_secilir(String aciklama, String gelirTipi, String duzenli ) throws InterruptedException {

   page.aciklamaGirme(aciklama);
   ReusableMethods.scrollWithUiScrollableAndClick(gelirTipi);
   ReusableMethods.scrollWithUiScrollableAndClick(duzenli);
    }
    @Given("gelir ekleme sayfasinda kategori bolumunde serbest gelir secilir")
    public void gelir_ekleme_sayfasinda_kategori_bolumunde_serbest_gelir_secilir() {




    }
    @Given("gelir ekleme sayfasinda tarih secme bolumunden tarih secimi yapilir")
    public void gelir_ekleme_sayfasinda_tarih_secme_bolumunden_tarih_secimi_yapilir() {




    }
    @Given("gelir ekleme sayfasinda tutar degeri girilir")
    public void gelir_ekleme_sayfasinda_tutar_degeri_girilir() {




    }
    @Given("gelir ekleme sayfasinda kaydet butonuna tiklanir")
    public void gelir_ekleme_sayfasinda_kaydet_butonuna_tiklanir() {




    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {



    }




}

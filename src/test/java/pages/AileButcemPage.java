package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage () {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofMillis(500)), this);
    }

    public void ilkEkranAyarlari() throws InterruptedException {

        Thread.sleep(5000);

        for (int i = 0; i < 6; i++) {
            ReusableMethods.ekranKaydirmaMethodu(915,1262,750,187,1262);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement emailButton;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordButton;

    @FindBy(xpath = "//*[@text='Başarılı']")
    public  MobileElement girisBasarili;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement menuButton;

    @FindBy(xpath = "//*[@text='Hesabım']")
    public MobileElement hesabimButton;


    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement nameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement surnameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement cityBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement ageBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement jobBox;

    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydetButton;



    public void dortCizgiMenu () throws InterruptedException {
        Thread.sleep(6000);

        ReusableMethods.tiklamaMethodu(117,230,5);


    }

    public void temizleme(){

        nameBox.clear();
        surnameBox.clear();
        cityBox.clear();
        ageBox.clear();
        jobBox.clear();


    }

    public void hesapBilgileri(String name, String surname, String city, String age, String job){

        temizleme();

        nameBox.sendKeys(ConfigReader.getProperty(name));
        surnameBox.sendKeys(ConfigReader.getProperty(surname));
        cityBox.sendKeys(ConfigReader.getProperty(city));
        ageBox.sendKeys(ConfigReader.getProperty(age));
        jobBox.sendKeys(ConfigReader.getProperty(job));
        kaydetButton.click();




    }

    public void assertionTextBox (String name, String surname, String city, String age, String job) {

        Assert.assertTrue(nameBox.getText().equals(ConfigReader.getProperty(name)));
        Assert.assertTrue(surnameBox.getText().equals(ConfigReader.getProperty(surname)));
        Assert.assertTrue(cityBox.getText().equals(ConfigReader.getProperty(city)));
        Assert.assertTrue(ageBox.getText().equals(ConfigReader.getProperty(age)));
        Assert.assertTrue(jobBox.getText().equals(ConfigReader.getProperty(job)));
    }





}

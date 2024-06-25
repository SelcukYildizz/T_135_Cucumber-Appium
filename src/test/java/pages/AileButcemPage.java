package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage () {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofMillis(500)), this);
    }

    public void ilkEkranAyarlari(){

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

    public void dortCizgiMenu () throws InterruptedException {
        Thread.sleep(6000);

        ReusableMethods.tiklamaMethodu(117,230,5);


    }





}

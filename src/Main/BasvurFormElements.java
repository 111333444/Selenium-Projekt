package Main;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasvurFormElements {

    public BasvurFormElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement basvurBtn;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(css = "[class='t-input-phonemask__select']")
    public WebElement phoneCode;

    @FindBy(id = "t-phonemask_tr")
    public WebElement selectCountryCode;

    @FindBy(name = "tildaspec-phone-part[]")
    public WebElement phoneNumber;

    @FindBy(id = "sb-1667664755026")
    public WebElement country;

    @FindBy(css = "[value='Andorra']")
    public WebElement selectCountry;

    @FindBy(id = "sb-1663337581601")
    public WebElement course;

    @FindBy(css = "[value='SDET Türkçe']")
    public WebElement selectCourse;

    @FindBy(id = "sb-1670423010572")
    public WebElement connection;

    @FindBy(css = "[value='Arkadaş vasıtası ile']")
    public WebElement selectConnection;

    @FindBy(css = "[class='t-checkbox__indicator']")
    public WebElement terms;

    @FindBy(css = "[type='submit']")
    public WebElement submit;

    @FindBy(css = "[id='captchaIframeBox']")
    public List<WebElement> frames;

    @FindBy(css = "[id='tildaformsuccesspopup']")
    public WebElement popup;

}

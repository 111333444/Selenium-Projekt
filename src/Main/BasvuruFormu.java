package Main;

import Utility.BaseDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasvuruFormu extends BaseDriver {

    @Test
    public void basvuruFormu() {

        BasvurFormElements elements = new BasvurFormElements();

        driver.get("https://techno.study/tr/");
        Actions actions = new Actions(driver);

        elements.basvurBtn.click();
        elements.name.sendKeys("Test");
        elements.email.sendKeys("test@emr.com");
        actions.moveToElement(elements.phoneCode).click().build().perform();
        elements.selectCountryCode.click();
        elements.phoneNumber.sendKeys("99999999999");
        elements.country.click();
        elements.selectCountry.click();
        elements.course.click();
        elements.selectCourse.click();
        elements.connection.click();
        elements.selectConnection.click();
        elements.terms.click();
        elements.submit.click();

        if (elements.frames.size() > 0) {
            Assert.assertTrue(elements.frames.get(0).isDisplayed(), "Bulunamadi!!!!");
        }
        else {
              Assert.assertTrue(elements.popup.isDisplayed(), "Bulunamadi!!!!");
        }

        driver.close();
    }
}

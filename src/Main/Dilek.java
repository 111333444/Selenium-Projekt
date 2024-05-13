package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dilek extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://techno.study/tr/");
        WebElement apply = driver.findElement(By.cssSelector("a[class='tn-atom js-click-zero-stat']"));
        apply.click();

        WebElement fullName = driver.findElement(By.cssSelector("input[name='name']"));
        fullName.sendKeys("TestUgur");

        WebElement Email = driver.findElement(By.cssSelector("input[name='email']"));
        Email.sendKeys("testugur80@gmail.com");

        WebElement telnumber = driver.findElement(By.cssSelector("input[name='tildaspec-phone-part[]']"));
        telnumber.sendKeys("+1999999999");

        WebElement choosecountry = driver.findElement(By.cssSelector("select[name='country']"));
        Select ulke = new Select(choosecountry);
        ulke.selectByIndex(4);

        WebElement choosecourse = driver.findElement(By.cssSelector("select[name='course']"));
        Select kurs = new Select(choosecourse);
        kurs.selectByIndex(1);

        WebElement didyouhear = driver.findElement(By.cssSelector("select[name='survey']"));
        Select duy = new Select(didyouhear);
        duy.selectByIndex(7);

        WebElement promecode = driver.findElement(By.cssSelector("input[name='promo code']"));
        promecode.sendKeys("80");

        WebElement locater = driver.findElement(By.cssSelector("[class='t-checkbox__labeltext']"));
        locater.click();

        WebElement gonderBtn = driver.findElement(By.cssSelector("[type = 'submit']"));
        gonderBtn.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tildaformsuccesspopuptext']//span")));
        WebElement dogrulama = driver.findElement(By.xpath("//div[@id='tildaformsuccesspopuptext']//span"));
        Assert.assertEquals(dogrulama.getText(), "Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.");

    }
}

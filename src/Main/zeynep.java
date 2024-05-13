package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class zeynep extends BaseDriver {

    @Test
    public void accessToSocialMedia(){

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);

        WebElement techoStudyFacebook= driver.findElement(By.xpath("(//a[@aria-label='facebook'])"));
        techoStudyFacebook.click();
        MyFunc.Bekle(2);

        WebElement techoStudyInstagram= driver.findElement(By.xpath("(//a[@aria-label='instagram'])"));
        techoStudyInstagram.click();
        MyFunc.Bekle(2);

        WebElement techoStudyYoutube= driver.findElement(By.xpath("(//a[@aria-label='youtube'])"));
        techoStudyYoutube.click();
        MyFunc.Bekle(2);

        WebElement techoStudyLinkedin= driver.findElement(By.xpath("(//a[@aria-label='linkedin'])"));
        techoStudyLinkedin.click();
        MyFunc.Bekle(2);


        driver.close();


    }
}

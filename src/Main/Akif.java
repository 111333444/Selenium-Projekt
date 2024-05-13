package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Akif extends BaseDriver {

    @Test
    public void Test1() {
        driver.manage().window().maximize();
        Actions actiondriver = new Actions(driver);
        driver.get("https://techno.study/tr/");

        WebElement kurslarMove = driver.findElement(By.xpath("//*[@class='t-menu__link-item t966__tm-link']"));
        actiondriver.moveToElement(kurslarMove).perform();
        MyFunc.Bekle(1);

        WebElement sdetClick = driver.findElement(By.xpath("//*[@field='li_title__1607692272826']"));
        sdetClick.click();


    }
}

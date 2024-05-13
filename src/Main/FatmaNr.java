package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FatmaNr extends BaseDriver {
    @Test
    public void test(){

        driver.get("https://techno.study/tr/");

        WebElement login =driver.findElement(By.xpath("//*[text()='Campus Login']"));
        login.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"), "login sayfasina gidilmedi");


    }
}

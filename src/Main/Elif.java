package Main;


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import Utility.MyFunc;





    public class Elif extends BaseDriver {
        @Test
        public void test(){



            driver.get("https://techno.study/tr");
            MyFunc.Bekle(3);

            WebElement logo= driver.findElement(By.cssSelector("div[class='t228__leftcontainer']"));
            logo.click();

            Assert.assertFalse(driver.getCurrentUrl().equals("https://campus.techno.study/"), "Ana sayfaya ulasti");











        }
    }




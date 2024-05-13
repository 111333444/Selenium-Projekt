package Main;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class suleyman extends BaseDriver {
   @Test
    public void  kullanimsartlari(){
       driver.get("https://techno.study/tr/");
       WebElement sartlar=driver.findElement(By.xpath("//*[text()='Şartları']"));
       sartlar.click();
       Assert.assertTrue(!driver.getCurrentUrl().equals("https://techno.study/tr/"),"sartlar sayfasina gidilemedi");


   }


}

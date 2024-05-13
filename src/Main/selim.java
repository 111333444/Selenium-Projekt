package Main;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selim extends BaseDriver {

    @Test
    public void SdetYazTestMuhTest01() {

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanının sonuna gider.
        MyFunc.Bekle(2);

        WebElement SdetYazTestMuh = driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        SdetYazTestMuh.click();
        MyFunc.Bekle(2);

        String actualText = "Yazılım Test Mühendisi";
        Assert.assertEquals(actualText, "Yazılım Test Mühendisi");
        driver.close();

    }

    @Test
    public void AndroidUygulamaGelistirmeTest02() {
        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);

        WebElement AndroidUyGel = driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        AndroidUyGel.click();
        MyFunc.Bekle(2);

        String ActualText = "Android uygulama geliştirme";
        Assert.assertEquals(ActualText, "Android uygulama geliştirme");

        driver.close();

    }

    @Test
    public void VeriBilimiTest03() {

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);

        WebElement VeriBilimi = driver.findElement(By.linkText("Veri Bilimi"));
        VeriBilimi.click();

        String actualText = "Veri Bilimi Bootcamp";
        Assert.assertEquals(actualText, "Veri Bilimi Bootcamp");

        driver.close();

    }

    @Test
    public void MastersProgramTest04(){

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(2);

        WebElement MastersProgram= driver.findElement(By.linkText("Master's Program"));
        MastersProgram.click();

        String ActualText="Master's Degree";
        Assert.assertEquals(ActualText,"Master's Degree");

        driver.close();


    }

         @Test
         public void SDETDetaliyBilgiTest05(){
        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(2);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        MyFunc.Bekle(2);

        WebElement SDETDetayliBilgi= driver.findElement(By.xpath("//a[@href='https://techno.study/tr/sdet']"));
        SDETDetayliBilgi.click();
        MyFunc.Bekle(2);

        WebElement TSLOgo= driver.findElement(By.xpath("//img[@src='https://static.tildacdn.com/tild3162-6664-4630-a262-663435303236/logo_TS-01.png']"));
        TSLOgo.click();
        MyFunc.Bekle(2);

        String actualText="Learn new skills.Find a new job.";
        Assert.assertEquals(actualText,"Learn new skills.Find a new job.");

        driver.close();

    }

        @Test
        public void AndroidUygulamaGelistiriciTest06(){

        driver.get("https://techno.study/tr/");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        MyFunc.Bekle(2);

        WebElement AndGelDetayliBilgi= driver.findElement(By.xpath("//a[@href='https://techno.study/tr/androidapp']"));
        AndGelDetayliBilgi.click();
        MyFunc.Bekle(2);

        WebElement TSLogo= driver.findElement(By.xpath("//img[@src='https://static.tildacdn.com/tild3162-6664-4630-a262-663435303236/logo_TS-01.png']"));
        TSLogo.click();
        MyFunc.Bekle(2);

        String actualText="Android uygulama geliştirme";
        Assert.assertEquals(actualText,"Android uygulama geliştirme");


        driver.close();
    }

        @Test
        public void VeriBilimiDetayliBilgiTest07(){

       driver.get("https://techno.study/tr/");

            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,2000)");
            MyFunc.Bekle(2);

            WebElement VeriBilimiDetayliBilgi= driver.findElement(By.linkText("Detaylı bilgi"));
            VeriBilimiDetayliBilgi.click();

            WebElement TSLogo= driver.findElement(By.xpath("//img[@src='https://static.tildacdn.com/tild3162-6664-4630-a262-663435303236/logo_TS-01.png']"));
            TSLogo.click();
            MyFunc.Bekle(2);

            String actualText="Learn new skills.Find a new job.";
            Assert.assertEquals(actualText,"Learn new skills.Find a new job.");


            driver.close();
}
}
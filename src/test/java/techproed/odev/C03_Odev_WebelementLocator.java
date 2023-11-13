package techproed.odev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class C03_Odev_WebelementLocator {
    public static void main(String[] args) {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Çıkan reklamı locate edip kapatalım
        //Arama bölümünde qa aratalım
        WebElement aramaKutusu = driver.findElement(By.id("searchHeaderInput"));
        aramaKutusu.sendKeys("qa", Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualSayfaBasligi = driver.getTitle();
        String expectedSayfaBasligi = "qa";
        if(actualSayfaBasligi.contains(expectedSayfaBasligi)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        //Carrer Opportunities In QA linkine tıklayalım
        //Başlığın Opportunities içerdiğini test edelim
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım

    }
}

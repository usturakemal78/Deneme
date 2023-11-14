package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.WeakHashMap;

public class C04_Deneme {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("bıdı bıdı "+(sonucYazisi.get(0).getText()));

        String[] sonucSayisi = sonucYazisi.get(0).getText().split(" ");
        System.out.println(sonucSayisi[4]);

        List<WebElement> urunler = driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urunler.get(0);


        System.out.println(ilkUrun.isDisplayed());
        System.out.println(ilkUrun.isEnabled());
        System.out.println(ilkUrun.isSelected());
        ilkUrun.click();
        driver.close();
    }
}

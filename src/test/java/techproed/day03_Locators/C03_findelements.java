package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayafasına gidelim
        driver.get("https://amazon.com");


        //Sayfadaki liklerin sayısını ve linkleri yazdıralım
        /*
        findelement ile bir webelemente ulaşabilirken, birden fazla webelement için findelements() methodu
        kullanırız. Bu webelementlerin sayısına ulaşmak için ya da bu webElementlerin yazısını konsola yazdırabilmek için
        List<Webelement> LinklerListesi = driver.findElements(By.locator("locator değeri")); olarak kullanırız
        oluşturmuş olduğumuz list'i loop ile konsola yazdırabiliriz.
        */

        List<WebElement> linklerinListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı : " + linklerinListesi.size());

        for (WebElement w : linklerinListesi) {
            if (!w.getText().isEmpty()) {     // if bloğunu kullanmadan yazdırdığımızda arada boşluklar olabiliyor bu yüzden buraya aldık if olamadan da yazar
                System.out.println(w.getText());
            }


        }
        //Lambda ile yazdıralım
        //linklerinListesi.forEach(link ->{if(link.getText().isEmpty()){System.out.println(link.getText());}});

        System.out.println("*******************************************");

        //Hello sing in  webelementinin yazısını yazdıralım
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementyazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementyazisi.getText());

        //Sayfayı kapatalım
        driver.close();
    }
}

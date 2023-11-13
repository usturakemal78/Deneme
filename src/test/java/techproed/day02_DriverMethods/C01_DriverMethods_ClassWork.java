package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon Sayfasina Gidelim
        driver.get("https://www.amazon.com");

        //Sayfa basliginin Amazon icerdigini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");


        //Url'nin https://www.amazon.com/ oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL TEST PASSED");
        }else System.out.println("URL TEST FAILED"+actualUrl);

        //Sayfayi kapatalim
        driver.close(); // driver.quit(); -- > birden fazla browser varsa hepsini kapatır.
    }
}

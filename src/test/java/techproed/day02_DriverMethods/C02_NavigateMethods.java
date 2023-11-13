package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get methodu ile aynı mantıkta çalışır
        Thread.sleep(2000);//java kodlarını bekletmek için kullanabiliriz

        //Sonra Amazon Sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //Amazon sayfasinin başlığını yazdiralim
        System.out.println("Amazon sayfa başlığı : "+driver.getTitle());
        Thread.sleep(2000);

        //Techpproeducation Sayfasina geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        //Sayfa başlığını yazdıralım
        System.out.println("Techproeducation sayfa başlığı : "+driver.getTitle());

        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon sayfası url'si : "+driver.getCurrentUrl());
        Thread.sleep(2000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();

        //Sayfayı kapatalim
        driver.close();
    }
}

package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
            ImplicitlyWait(Duration.ofSeconds(20)) Sayfadaki webelementleri görünür olana kadar (sayfa oluşana kadar)
        maximum 20 saniye bekler.Eğer webelementler 2 sanşiyede oluşursa 2 saniye bekler ve alt satıra geçer. Fakat
        belirttiğimiz maksimumum süre boyunca internetten kaynaklı olarak webelementler oluşmazsa
        testimiz failed verir.
            Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler 30 saniye beklemesini belirtirsem
        30 saniye bekler ve altsatıra geçer.
         */

        // Techpro sayfasına gidelim
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);
        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        // Techpro sayfasına geri dönelim
        driver.navigate().back();
        // Sayfa başlığının techpro içerdiğini test edelim
        String actualSayfaBasligi = driver.getTitle();
        String expectedSayfaBasligi = "techpro";
        if(actualSayfaBasligi.contains(expectedSayfaBasligi)){
            System.out.println("Techpro sayfa basligi testi basarili : ");
        }else System.out.println("Sayfa basligi basarisiz : "+actualSayfaBasligi);
        // Tekrar amazon sayfasına gidelim
        driver.navigate().forward();
        // Sayfa başlığının Amazon içerdiğini test edeilim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Amazon sayfa basligi testi basarli");
        }else System.out.println("Amazon sayfa basligi testi basarisiz : "+driver.getTitle());
        //sayfayı kapatalım
        driver.close();
    }


}

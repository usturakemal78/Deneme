package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com");
        //getTitle() methodu sayfa basligini verir
        System.out.println("Hepsiburada Sayfa Basligi : "+driver.getTitle());
        driver.get("https://techproeducation.com");
        System.out.println("Techpro Education Sayfa Basligi : "+driver.getTitle());

        //getCurrentUrl() gidilen sayfanin url'sini verir
        driver.get("https://techproeducation.com");
        System.out.println("Techpro Education Actual Url : "+driver.getCurrentUrl());

        driver.get("https:/amazon.com");
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource());-- > Bilerek yoruma aldık her çalıştırmamızsda karşımıza çıkacağı için

        //getWindowHandle() gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız.
        driver.get("https://techproeducation.com");
        System.out.println("Techpro Window Handle Değeri :" +driver.getWindowHandle());//E175A375215C853A36BD7023FC928028

        //yukarıda bir örnek yapacağım hepsiburadanın windoehanlde değerini lamka için String bir değişkene atayacağım
        driver.get("https://hepsiburada.com");
        String hepsiburadaWindowHandle = driver.getWindowHandle();
        System.out.println("Hepsi Burada Window Hanle Değeri : "+hepsiburadaWindowHandle);//
    }
}

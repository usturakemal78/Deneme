package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
        webElLenentlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
        moximize yaparsak driver bütün webelementleri görür ve rahotlikla müdehale edebilir. Bu yüzden
        browser'i açtıktan sonra ilk olarak driver.manage() .window() .noximize(); yapmamız bizim webelementlere
        ulaşmada isimizi kolaylaştırır. Böylelikle fail almamis ouruz.
         */

        // Browseri'in konumunu konumunu
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());
        // Browseri'in boyutlarını yazdıralım konumunu
        System.out.println("Sayfanın boyutu . "+driver.manage().window().getSize());
        // Browser'i maximize yapalım
        driver.manage().window().maximize();
        // Techproeducation sayfasina gidelim
        driver.get("https:/techproeducation.com");
        // Browser'in konumunu yazdıralım
        System.out.println("Sayfanın ikinci konumu : "+driver.manage().window().getPosition());
        // Browser'in boyutlarını yazdıralım
        System.out.println("Sayfanın boyutunu yazdıralım : "+driver.manage().window().getSize());
        Thread.sleep(2000);
        // Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(2000);
        // Sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();

        // Browsweri istedigimiz pozisyona getirir
        driver.manage().window().setPosition(new Point(50,50));
        // Browser'i istediğimiz boyuta getirir
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(2000);
        // Sayfayı kapatalım
        driver.close();
    }

}

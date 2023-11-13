package techproed.day02_DriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C05_Deneme {
    public static void main(String[] args) {

        System.setProperty("edgeDriver","src/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String techpro = "https://techproeducation.com";
        String amazon = "https://amazon.com";
        driver.get(techpro);
        driver.get(amazon);
        driver.navigate().back();

        String actualTitle = driver.getTitle();
        String expectedTitle = "TechPro";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("İçeriyor");
        }else System.out.println("içermiyor"+actualTitle);

        driver.navigate().forward();
        if (driver.getTitle().contains("Amazon")){
            System.out.println("iceriyor gıı");
        }else System.out.println("omamış bizim oglan"+driver.getTitle());
    }
}

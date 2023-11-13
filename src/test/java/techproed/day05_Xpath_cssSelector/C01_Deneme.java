package techproed.day05_Xpath_cssSelector;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_Deneme {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgedriver", "src/resources/drivers/edgeriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


      /*  driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElemenet = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        Thread.sleep(2000);
        addElemenet.click();
        Thread.sleep(2000);
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if(deleteButton.isDisplayed()){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        WebElement addeRemoveElenemnts = driver.findElement(By.cssSelector("h3"));
        if(addeRemoveElenemnts.isDisplayed()){
            System.out.println("Test Passed");
        }else System.out.println("Test Passed");

        driver.close();

*/

        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        WebElement hybridBike = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.getText());
        WebElement electricBike = driver.findElement(with(By.tagName("li")).below(hybridBike));
        System.out.println(electricBike.getText());
        WebElement complateBike = driver.findElement(with(By.tagName("a")).below(electricBike));
        System.out.println(complateBike.getText());


        System.out.println("/////////////////////****************************/////////////////////");


        List<WebElement> linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
        for (WebElement w : linklerListesi) {
            System.out.println(w.getText());

        }
        for (int i = 0; i < linklerListesi.size(); i++) {
            linklerListesi = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=10 and position()<=16]"));
            System.out.println(linklerListesi.get(i).getText());
            linklerListesi.get(i).click();
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
        }


        //  complateBike.click();


    }


}

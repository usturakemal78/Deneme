package techproed.odev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev1_GetMethods {
    public static void main(String[] args) {
        System.setProperty("chromedriver","src/resources/drivers/chromedriver.exe");
        WebDriver amz = new ChromeDriver();

        //Amazon sayfasina gidelim
        amz.get("https://amazon.com");

        //Sayfa basligini yazdiralim
        System.out.println("Sayfa Başlığı : "+amz.getTitle());

        //Sayfa basliginin amazon icersigini test edelim
        String gercekBaslik = amz.getTitle();
        String beklenenBaslik = "Amazon";
        if(gercekBaslik.contains(beklenenBaslik)){
            System.out.println("Sayfa Amazon kelimesi içeriyor");
        }else System.out.println("Sayfa Amazon kelimesi icermiyor");

        //Sayfanin "url" sini yazdiralim
        System.out.println("Sayfanın Url'si : "+amz.getCurrentUrl());

        //Sayfanin "url" sinin "amazon" icerdigini test edelim
        String gercekUrlGecenKelime = amz.getCurrentUrl();
        String beklenenUrlGecenKelime = "amazon";
        if(gercekUrlGecenKelime.contains(beklenenUrlGecenKelime)){
            System.out.println("TEST DE GERCEK URLE GECİYOR");
        }else System.out.println("TEST DE GERCEK URL GECMİYOR : "+gercekUrlGecenKelime);

        //Sayfa Handle degerini yazdiralim
        System.out.println("SAYFA WİNDOWHANDLE DEGERİ : "+amz.getWindowHandle());

        //Sayfanin HTML kodlarinda "Gateway kelimesinin geçtigini test edelim
        String gercekSayfaHtmlKodlariGecenKelime = amz.getPageSource();
        String beklenenSayfaHtmlKodlariGecenKelime = "Gateway";
        if(gercekSayfaHtmlKodlariGecenKelime.contains(beklenenSayfaHtmlKodlariGecenKelime)){
            System.out.println("HTML SAYFASINDA GATEWAY KELİMESİ GECİYOR");
        }else System.out.println("HTML SAYFASINDA GATEWAY KELİMESİ GEÇMİYOR");

        //Sayfayi kapatalim
        amz.close();
    }
}

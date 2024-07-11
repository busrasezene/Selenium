/*Selenium WebDriver ve WebDriverManager kullanarak IntelliJ IDEA'da tarayıcı otomasyonu gerçekleştirdim; Web sayfalarında gezinti, başlık doğrulama,
ve URL kontrolü gibi işlemleri otomatikleştirdim*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "https://www.google.com" );

        // String googleSource = driver.getPageSource();
        //String googleHandle = driver.getWindowHandle();
        //System.out.println( googleHandle );

        String googleTitle = driver.getTitle();
        System.out.println( "Google title is:" +googleTitle);

        driver.navigate().to("https://www.udemy.com" );

        String udemyTitle = driver.getTitle();
        System.out.println( "Udemy title is:" +udemyTitle);

        String udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is:" + udemyUrl);
        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is:" + googleUrl);

        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        googleUrl = driver.getCurrentUrl();
        System.out.println("Google url is:" + googleUrl);

        driver.navigate().forward();
        udemyUrl = driver.getCurrentUrl();
        System.out.println("Udemy url is:" + udemyUrl);
        
        driver.quit(); 

        
    }
}                              

//Geçerli bilgiler girilerek başarılı Login olmak;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstClass {
    public static void main(String[] args) { 
        

        WebDriverManager.chromedriver().setup();
        //Kurulum
        WebDriver driver = new ChromeDriver();
        //Web sitesini açmak için
        driver.get("https://the-internet.herokuapp.com/login");
        //Komut dosyasını her adımdan sonra çalıştırmalıyız.
        //Run ile çalıştırıyoruz.
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //Username kısmına tomsmith yazar.
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //password kısmına parolayı yazar.
        driver.findElement(By.className("radius")).click();
        //oturum açma fonksiyonunu doğrulamak (Login butonu)
        driver.quit();
        //Tarayıcıyı kapatır

    }
}   

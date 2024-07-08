/*Selenium WebDriver ve WebDriverManager kullanarak Chrome, Edge ve Safari tarayıcılarında otomasyon senaryoları gerçekleştirdim.*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class automateBrowsers {
    public static void main(String[] args) {
       // WebDriverManager.firefoxdriver().setup();
       // WebDriver driver = new FirefoxDriver();
        // WebDriverManager.edgedriver().setup();
        // WebDriver driver = new EdgeDriver();
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();
    }
}

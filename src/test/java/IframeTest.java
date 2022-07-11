import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class IframeTest {

    @Test
    public void testNewWindow() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        // metoda mało dokładna -> driver.switchTo().frame(0);
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("fname")).sendKeys("Krzysiek");
        // chcąc powórcić do poprzedniego iframe na stronie, używamy polecenia switchTo().defaultContent();
    }
}

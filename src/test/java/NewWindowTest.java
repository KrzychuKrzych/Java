import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class NewWindowTest {

    @Test
    public void testNewWindow() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        // .getWindowHandle() - pobiera wartość bieżącego okna
        String currentWindow = driver.getWindowHandle();
        driver.findElement(By.id("newPage")).click();
        // .getWindowHandles - z "s" na końcu pobiera wszystkie aktualne okna
        Set<String> windowNames = driver.getWindowHandles();
        // interujemy "oknem" przez wszystkie okna
        // w ifie szukamy okien różnych od bieżącego i je otwieramy - switchTo()
        for(String window : windowNames) {
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.switchTo().window(currentWindow);
        driver.findElement(By.name("fname")).sendKeys("Krzysiek");

    }
}

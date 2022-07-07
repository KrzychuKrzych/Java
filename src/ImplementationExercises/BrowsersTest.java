package ImplementationExercises;

public class BrowsersTest {

    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("firefox");

        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new Chrome();
        } else if (name.equals("firefoox")) {
            return new FireFox();
        } throw new NoValidBrowserName("Zla sciezka!");
    }
}

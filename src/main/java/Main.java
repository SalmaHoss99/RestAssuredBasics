
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium";

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual title: " + actualTitle);
        }

        driver.quit();
    }
}

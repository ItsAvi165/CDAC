package tester;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class YelpSearchAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Navigate to Yelp
        driver.get("https://www.yelp.com/");
        
        // Enter "Restaurant" in the search box
        driver.findElement(By.id("search")).sendKeys("Restaurant");
        
        // Click on the search button
        driver.findElement(By.id("search_button")).click();
        
        // Verify the title of the result page
//        String pageTitle = driver.getTitle();
//        if (pageTitle.contains("Restaurant")) {
//            System.out.println("Search successful");
//        } else {
//            System.out.println("Search failed");
//        }
        
        Assert.assertEquals(driver.getTitle(),"TOP 10 BEST Restaurant in San Francisco, CA - January 2024 - Yelp");
        // Close the browser
        //driver.quit();
    }
}

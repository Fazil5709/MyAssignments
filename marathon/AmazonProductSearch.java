package seleniumproject.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonProductSearch {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"))
                .sendKeys("Bags for boys", Keys.ENTER);
        String result = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
        System.out.println(result);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
        String productName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
        System.out.println("Product Name:" + productName);
        Thread.sleep(3000);
        String producePrize = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("Produce Prize:" + producePrize);
        String pageTitle = driver.getTitle();
        System.out.println("pageTitle:" + pageTitle);
        driver.close();

    }

}

package seleniumproject.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PvrCinemaBooking {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.pvrcinemas.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
        driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']/span"))
                .click();
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
        driver.findElement(By.xpath("//button[@class='sc-bbbBoY kbsOBB btn-proceeded']")).click();
        String seatInfo = driver.findElement(By.xpath("//div[@class='summary-movies-content']")).getText();
        System.out.println(seatInfo);

        String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
        System.out.println("Seat No:" + seatNo);
        Thread.sleep(3000);

        String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']/h6/span")).getText();
        System.out.println("Grand Total" + grandTotal);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[text()='Continue']")).click();

        WebElement close = driver.findElement(
                By.xpath("//div[contains(@class,'cross-icon')]//i[contains(@class,'pi-times')]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", close);
        String title = driver.getTitle();
        System.out.println("Title" + title);
        driver.close();

    }

}

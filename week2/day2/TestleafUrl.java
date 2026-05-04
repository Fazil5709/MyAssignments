package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestleafUrl {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhinesh");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
        WebElement dropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select sourceDD = new Select(dropDown);
        sourceDD.selectByIndex(4);
        driver.findElement(By.name("submitButton")).click();

    }

}

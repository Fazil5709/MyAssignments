package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Testleaf Accounting");
        driver.findElement(By.name("description")).sendKeys("Description");
        WebElement dropDown = driver.findElement(By.name("industryEnumId"));
        Select sourceDD = new Select(dropDown);
        sourceDD.selectByIndex(3);
        WebElement dropdown1 = driver.findElement(By.name("ownershipEnumId"));
        Select ownerShip = new Select(dropdown1);
        ownerShip.selectByVisibleText("S-Corporation");
        WebElement dropdown2 = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(dropdown2);
        source.selectByValue("LEAD_EMPLOYEE");
        WebElement dropdown3 = driver.findElement(By.id("marketingCampaignId"));
        Select campaign = new Select(dropdown3);
        campaign.selectByIndex(6);
        WebElement dropdown4 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(dropdown4);
        state.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
        driver.close();

    }

}

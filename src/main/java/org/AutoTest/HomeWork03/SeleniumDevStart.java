package org.AutoTest.HomeWork03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDevStart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        Thread.sleep(5000);
        login(driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/ul/li[3]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div[2]/div/div/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("crm_expense_request[description]")).sendKeys("Тест1");
        Select selectBusinessUnit = new Select(driver.findElement(By.name("crm_expense_request[businessUnit]")));
        selectBusinessUnit.selectByVisibleText("Research & Development");
        Select expenditureSelect = new Select(driver.findElement(By.name("crm_expense_request[expenditure]")));
        expenditureSelect.selectByVisibleText("01101 - ОС: вычислительная техника инфраструктуры");
        driver.findElement(By.xpath("//*[@name=\"crm_expense_request[sumPlan]\"]")).sendKeys("100");
        driver.findElement(By.xpath("//input[contains(@id, 'datePlan') and @placeholder='Укажите дату']")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@class=\"btn btn-success action-button\"]")).click();
        Thread.sleep(5000);
        driver.quit();


    }
    static void login(WebDriver driver) {
        WebElement element = driver.findElement(By.id("prependedInput"));
        element.sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
    }


}

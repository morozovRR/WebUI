package org.AutoTest.HomeWork03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        login(driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/ul/li[3]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div/div/div[2]/div/div/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("crm_project[name]")).sendKeys("Create project");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/form/div[2]/div[3]/div/div[1]/div[2]/fieldset/div[1]/div[2]/div[2]/div/div[1]/a/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[3]/div")).click();
        driver.findElement(By.name("crm_project[uniqueDescription]")).sendKeys("5, без пояснений.");
        Select selectPriority = new Select(driver.findElement(By.name("crm_project[priority]")));
        selectPriority.selectByVisibleText("Высокий");
        Select selectSourceFinance = new Select(driver.findElement(By.name("crm_project[financeSource]")));
        selectSourceFinance.selectByVisibleText("Инвестиции");
        Select selectSubdivision = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
        selectSubdivision.selectByVisibleText("Research & Development");
        Select selectCurator = new Select(driver.findElement(By.name("crm_project[curator]")));
        selectCurator.selectByVisibleText("Applanatest Applanatest Applanatest");
        Select selectRP = new Select(driver.findElement(By.name("crm_project[rp]")));
        selectRP.selectByVisibleText("Applanatest Applanatest Applanatest");
        Select selectAdminProject = new Select(driver.findElement(By.name("crm_project[administrator]")));
        selectAdminProject.selectByVisibleText("Амелина Светлана");
        Select selectManager = new Select(driver.findElement(By.name("crm_project[manager]")));
        selectManager.selectByVisibleText("Антонов Дмитрий");
        driver.findElement(By.xpath("//*[@name=\"crm_project\"]/div[1]/div/div/div[2]/div[1]/div[4]/button")).click();
        driver.quit();
    }
    static void login(WebDriver driver) {
        WebElement element = driver.findElement(By.id("prependedInput"));
        element.sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
    }
}

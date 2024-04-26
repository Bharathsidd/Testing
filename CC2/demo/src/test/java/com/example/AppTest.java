package com.example;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    WebDriver driver;
    @Test
    public void test1() throws IOException
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.barnesandnoble.com/#");
        driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[1]/a")).click();
        driver.findElement(By.linkText("Books")).click();
        FileInputStream fs=new FileInputStream("C:\\Users\\bhara\\OneDrive\\Desktop\\CC2.xlsx");
        XSSFWorkbook book=new XSSFWorkbook(fs);
        XSSFSheet sheet=book.getSheetAt(0);
        String data=sheet.getRow(0).getCell(0).getStringCellValue();
        driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/div[2]/div/input[1]")).sendKeys(data);
        driver.findElement(By.xpath("//*[@id='rhf_header_element']/nav/div/div[3]/form/div/span/button")).click();
        WebElement che=driver.findElement(By.xpath("//*[@id='searchGrid']/div/section[1]/section[1]/div/div[1]/div[1]/h1/span"));
        Assert.assertEquals("Chetan Bhagat", che.getText());
    }
    @Test
    public void test2()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.barnesandnoble.com/#");
        Actions actions=new Actions(driver);
        WebElement ele=driver.findElement(By.linkText("Audiobooks"));
        actions.moveToElement(ele).perform();
        driver.findElement(By.linkText("Audiobooks Top 100")).click();
        driver.findElement(By.cssSelector(".btn-addtocart.btn.btn--commerce.btn--medium.btn-plp-addtocart")).submit();
    }
    @Test
    public void test3()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.barnesandnoble.com/#");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        driver.findElement(By.xpath("/html/body/main/div[3]/div[3]/div/section/div/div/div/div/div/a[1]/div")).click();
    }
    
    
}

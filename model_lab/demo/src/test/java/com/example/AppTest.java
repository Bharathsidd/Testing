package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    WebDriver driver;
    @Test
    public void test1()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.ixigo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[1]/div[1]/div/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div/div/div/p[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("IDP-Independence");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/li")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input")).sendKeys("DEL-New Delhi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/li")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[20]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[21]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div/div")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/button[2]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[5]/div/div[3]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[2]/button")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button")).click();

    }
}

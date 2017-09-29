package com.company;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class StasTaurusDemo {
    @Test
    public void startDemo() {
        
        //Set WebDriver Path (Optional)
        System.setProperty("webdriver.chrome.driver", "C://Users/narsi01/Documents/WebdriverPath");
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("http://www.google.com");

            driver.findElement(By.name("q")).sendKeys("BlazeDemo");
            driver.findElement(By.name("q")).submit();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.linkText("BlazeDemo")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.xpath("//select[@name='fromPort']/option[text()='Boston']")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.xpath("//select[@name='toPort']/option[text()='New York']")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.className("btn-primary")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.className("btn-small")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.id("inputName")).sendKeys("Stas Michalski");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("address")).sendKeys("2390 El Camino Real");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("city")).sendKeys("Palo Alto");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("state")).sendKeys("CA");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("zipCode")).sendKeys("94306");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.xpath("//select[@name='cardType']/option[text()='American Express']")).click();
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("creditCardNumber")).sendKeys("00001111222233334444");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("creditCardMonth")).clear();
            driver.findElement(By.id("creditCardMonth")).sendKeys("01");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("creditCardYear")).clear();
            driver.findElement(By.id("creditCardYear")).sendKeys("2020");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)
            driver.findElement(By.id("nameOnCard")).sendKeys("Stas Michalski");
            Thread.sleep(1000);  // Pause in order to see test in action (Optional)

            driver.findElement(By.className("btn-primary")).click();


            Thread.sleep(5000);
        
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
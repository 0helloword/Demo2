package com.oc.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComElement {
	
	  private static WebElement element;
	
	 public static WebElement NextPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	
	    public static WebElement PreviousPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	
	    public static WebElement FirstPage(WebDriver driver){
	        element = driver.findElement(By.linkText("��һҳ"));//��һҳ����
	        return element;
	    }
	    
	    public static WebElement LastPage(WebDriver driver){
	        element = driver.findElement(By.linkText("���һҳ"));//���һҳ����
	        return element;
	    }
	    
	    public static WebElement Go(WebDriver driver){
	        element = driver.findElement(By.linkText("go"));//go����
	        return element;
	    }
	    
	    public static WebElement PageInput(WebDriver driver){
	        element = driver.findElement(By.id("pageInput"));//����ҳ��
	        return element;
	    }
	    
	    public static WebElement table(WebDriver driver){
	        element = driver.findElement(By.xpath("//table"));//����¼
	        return element;
	    }
	    
}

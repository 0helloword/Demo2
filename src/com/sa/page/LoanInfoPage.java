package com.sa.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoanInfoPage {
	
	    private static WebElement element;
	    
	    public static WebElement customerName(WebDriver driver){
	        element = driver.findElement(By.id("customerName"));//����������
	        return element;
	    }
	    
	    public static WebElement cardId(WebDriver driver){
	        element = driver.findElement(By.id("cardId"));//���������֤��
	        return element;
	    }

	    public static WebElement mobile(WebDriver driver){
	        element = driver.findElement(By.id("mobile"));//�ֻ�����
	        return element;
	    }
	    
	    public static WebElement repayType(WebDriver driver){
	        element = driver.findElement(By.id("repaymentType"));//��������
	        return element;
	    }
	    
	    public static WebElement repayBank(WebDriver driver){
	        element = driver.findElement(By.id("repaymentBank"));//��������
	        return element;
	    }
	    
	    public static WebElement repayAcc(WebDriver driver){
	        element = driver.findElement(By.id("repaymentAcc"));//�����˺�
	        return element;
	    }
	    
	    public static WebElement province(WebDriver driver){
	        element = driver.findElement(By.id("province"));//������ʡ��
	        return element;
	    }
	    
	    public static WebElement city(WebDriver driver){
	        element = driver.findElement(By.id("city"));//�����г���
	        return element;
	    }
	    
	    public static WebElement bankTel(WebDriver driver){
	        element = driver.findElement(By.id("bankTel"));//�����ֻ�����
	        return element;
	    }
	    
	    public static WebElement next(WebDriver driver){
	        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//��һ��
	        return element;
	    }
}


package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewApplyPage {

	  
    private static WebElement element;
    
    public static WebElement storeId(WebDriver driver){
        element = driver.findElement(By.id("storeId"));//�ŵ�ѡ��
        return element;
    }
 	    
    public static WebElement careerType(WebDriver driver){
        element = driver.findElement(By.id("careerType"));//ְҵѡ��
        return element;
    }
    
    public static WebElement productSeries(WebDriver driver){
        element = driver.findElement(By.id("productSeriesId"));//ϵ��ѡ��
        return element;
    }
    
    public static WebElement productType(WebDriver driver){
        element = driver.findElement(By.name("goodsReqs[0].cargoType"));//�������
        return element;
    }
    
    public static WebElement commodityType(WebDriver driver){
        element = driver.findElement(By.id("commodityClass_0"));//��Ʒ����
        return element;
    }
    
    public static WebElement commodityBrand(WebDriver driver){
        //element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/form/div[3]/table/tbody/tr/td[3]/div/select"));//��ƷƷ��
    	element = driver.findElement(By.id("commodityName_0"));
        return element;
    }
    
    public static WebElement commodityModel(WebDriver driver){
        element = driver.findElement(By.id("commodityType_0"));//��Ʒ�ͺ�
        return element;
    }
    
    public static WebElement commodityPrice(WebDriver driver){
        element = driver.findElement(By.name("goodsReqs[0].commodityPrice"));//��Ʒ�۸�
        return element;
    }
    
    public static WebElement commodityAmount(WebDriver driver){
        element = driver.findElement(By.id("amount"));//��Ʒ�ܼ۸�
        return element;
    }
    
    public static WebElement downPaymentAmount(WebDriver driver){
        element = driver.findElement(By.id("downPaymentAmount"));//�Ը����
        return element;
    }
    
    public static WebElement loanMoney(WebDriver driver){
        element = driver.findElement(By.id("loanMoney"));//��Ʒ���
        return element;
    }
    
    public static WebElement calculation(WebDriver driver){
        element = driver.findElement(By.cssSelector("button.btn.blue-madison"));//���㰴��
        return element;
    }
    
    public static WebElement productId(WebDriver driver){
        element = driver.findElement(By.name("productId"));//��Ʒ����
        return element;
    }
    
    public static WebElement submitBtn(WebDriver driver){
        element = driver.findElement(By.id("submitBtn"));//�ύ
        return element;
    }
    
    public static WebElement ensure(WebDriver driver){
        element = driver.findElement(By.id("ensure_sn"));//�ύȷ��
        return element;
    }
}

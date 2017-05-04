package com.sa.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.sa.basic.Log;
import com.sa.page.*;

public class LoginAction {
    
    private WebDriver driver;
    //1�����췽���ķ�����������������ͬ��
    //2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
    //3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ��������������
    public LoginAction(WebDriver driver){
        this.driver = driver;
    }
    
    //��¼
    public void Login(String user,String pw) {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage.userName(driver).sendKeys(user);
        Log.info("�����û�����"+user);
        LoginPage.passWord(driver).sendKeys(pw);
        Log.info("�������룺"+pw);
        LoginPage.loginButton(driver).click();
        Assert.assertEquals("С��", LoginPage.loginname(driver).getText());
        Log.info("��¼�ɹ�");
       
    }


        
    //����driver
    public WebDriver ReturnDriver(){
        return this.driver;
    }        
} 
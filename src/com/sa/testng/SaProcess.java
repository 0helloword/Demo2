package com.sa.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sa.action.*;
import com.sa.basic.*;


public class SaProcess {
	LoginAction login = null;
	HomePageAction homepage=null;
	NewApplyAction newapply=null;
	LoanInfoAction loaninfo=null; 
	UploadAction upload=null;
	BasicInfoAction basicinfo=null;
	WebDriver webdriver = new FirefoxDriver();
	
	@Parameters({"url_sa"})
	@BeforeTest
	public void beforeMethod(String url_sa) {
		Log.startTestCase("��ʼtestcase001");
		// ��ʼ���࣬��������
		login = new LoginAction(webdriver);
		//webdriver.get("http://123.57.56.45:10080/cnsa/initLogin");
		webdriver.get(url_sa);
		webdriver.manage().window().maximize();
	}
	
	@Parameters({"username", "password" })
	@Test(priority = 1)
	public void Login(String username,String password) {
		// ��¼
		login.Login(username, password);
	}
	
	@Parameters({"productSeries"})
	@Test(priority = 2)
	public void NewApply(String productSeries)throws InterruptedException {
		// �½���������
		homepage=new HomePageAction(webdriver);
		homepage.AddApp();//����pos��
		//homepage.AddNjApp();//����ũ����
		newapply=new NewApplyAction(webdriver);
		newapply.NewApply(productSeries);
	}
	
	@Parameters({"customername","cardId", "mobile","repayAcc" })
	@Test(priority = 3)
	public void LoanInfo(String customername,String cardId,String mobile,String repayAcc)throws InterruptedException {
		// ������Ϣ
		loaninfo=new LoanInfoAction(webdriver);
		loaninfo.loaninfo(customername,cardId, mobile, repayAcc);
	}
	
	@Parameters({"picpath" })
	@Test(priority = 3)
	public void Upload(String picpath)throws InterruptedException {
		// ������Ϣ
		upload=new UploadAction(webdriver);
		upload.upload(picpath);
		//upload.getappid();
	}
	
	@Parameters({"email","qq","contractphone","uncontractphone","password" })
	@Test(priority = 3)
	public void BasicInfo(String email,String qq,String contractphone,String uncontractphone,String password)throws InterruptedException {
		// ������Ϣ
		basicinfo=new BasicInfoAction(webdriver);
		basicinfo.basicinfo(email, qq, contractphone, uncontractphone, password);

	}
}



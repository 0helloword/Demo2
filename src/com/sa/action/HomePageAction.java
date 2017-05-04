package com.sa.action;

import org.openqa.selenium.WebDriver;

import com.sa.page.HomePage;

public class HomePageAction {

	private WebDriver driver;

	// 1�����췽���ķ�����������������ͬ��
	// 2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	// 3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ��������������

	public HomePageAction(WebDriver driver) {
		this.driver = driver;
	}

	// ��������
	public void AddApp() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.AddApp(driver).click();

	}

	

	// ����driver
	public WebDriver ReturnDriver() {
		return this.driver;
	}

}

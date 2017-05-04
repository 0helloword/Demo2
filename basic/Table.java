package com.oc.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	private WebDriver driver;

	public Table(WebDriver driver) {
		this.driver = driver;
	}

	public void TableTest(String appstate) throws InterruptedException {
			ComElement.LastPage(driver).click();//�л������һҳ����ȡҳ�룬ͨ������ҳ����-1��*ÿҳ��¼����+���һҳ��¼����=������
			Thread.sleep(2000);
			String pages = ComElement.PageInput(driver).getAttribute("value");
			int pagenum = Integer.parseInt(pages)-1;//��ҳ������ȥ1
			WebElement table = ComElement.table(driver);
			List<WebElement> rows = table.findElements(By.tagName("tr"));//��ȡ���һҳ��tr��¼
			int lastpagerow = rows.size()-1;//��ȡtr������������������
			int recordnum = 20 * pagenum + lastpagerow;
			Log.info(appstate+" ��¼������Ϊ��" + recordnum);
		}	
	}


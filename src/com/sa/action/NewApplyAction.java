package com.sa.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.sa.page.NewApplyPage;

public class NewApplyAction {
	private WebDriver driver;

	public NewApplyAction(WebDriver driver) {
		this.driver = driver;
	}
	
	// �ύ����
	public void NewApply()
			throws InterruptedException {
		Thread.sleep(2000);
		new Select(NewApplyPage.storeId(driver)).selectByIndex(1);//�ŵ�
		Thread.sleep(2000);
		new Select(NewApplyPage.careerType(driver)).selectByIndex(1);//ְҵ
		Thread.sleep(2000);
		new Select(NewApplyPage.productSeries(driver)).selectByIndex(1);// ϵ��
		Thread.sleep(1000);
		new Select(NewApplyPage.productType(driver)).selectByIndex(1);//�������
		Thread.sleep(1000);
		new Select(NewApplyPage.commodityType(driver)).selectByIndex(4);//��Ʒ����
		Thread.sleep(1000);
		//new Select(NewApplyPage.commodityBrand(driver)).selectByIndex(1);//��ƷƷ��
		NewApplyPage.commodityBrand(driver).sendKeys("�����");
		Thread.sleep(1000);
		NewApplyPage.commodityModel(driver).sendKeys("001");//��Ʒ�ͺ�
		NewApplyPage.commodityPrice(driver).sendKeys("5000");//��Ʒ�۸�
		Thread.sleep(1000);
		NewApplyPage.commodityAmount(driver).click();
		NewApplyPage.downPaymentAmount(driver).sendKeys("2000");
		Thread.sleep(1000);
		NewApplyPage.loanMoney(driver).click();
		NewApplyPage.calculation(driver).click();
		Thread.sleep(2000);
		NewApplyPage.productId(driver).click();
		Thread.sleep(2000);
		NewApplyPage.submitBtn(driver).click();
		Thread.sleep(2000);
		NewApplyPage.ensure(driver).click();
	}
}
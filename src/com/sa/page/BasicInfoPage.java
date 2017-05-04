package com.sa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicInfoPage {
	private static WebElement element;
    
    public static WebElement issuingOrgan(WebDriver driver){
        element = driver.findElement(By.name("issuingOrgan"));//ǩ������
        return element;
    }
    
    public static WebElement idCardValidity(WebDriver driver){
        element = driver.findElement(By.id("idCardValidity"));//��Ч��
        return element;
    }
    
    public static WebElement today(WebDriver driver){
        element = driver.findElement(By.className("today"));//��Ч��-today
        return element;
    }
    
    public static WebElement degree(WebDriver driver){
        element = driver.findElement(By.id("degree"));//�����̶�
        return element;
    }
    
    public static WebElement emaill(WebDriver driver){
        element = driver.findElement(By.id("emaill"));//��������
        return element;
    }

    public static WebElement qqCode(WebDriver driver){
        element = driver.findElement(By.name("qqCode"));//QQ����
        return element;
    }
    
    public static WebElement marry(WebDriver driver){
        element = driver.findElement(By.name("marry"));//����״��
        return element;
    }
    
    public static WebElement liveCondition(WebDriver driver){
        element = driver.findElement(By.name("liveCondition"));//ס��״��
        return element;
    }
    
    public static WebElement householdProv(WebDriver driver){
        element = driver.findElement(By.id("householdProv"));//������ַ-ʡ
        return element;
    }
    
    public static WebElement householdCity(WebDriver driver){
        element = driver.findElement(By.id("householdCity"));//������ַ-��
        return element;
    }
    
    public static WebElement householdTown(WebDriver driver){
        element = driver.findElement(By.id("householdTown"));//������ַ-��
        return element;
    }
    
    public static WebElement householdZhen(WebDriver driver){
        element = driver.findElement(By.id("householdZhen"));//������ַ-��
        return element;
    }
    
    public static WebElement householdStr(WebDriver driver){
        element = driver.findElement(By.id("householdStr"));//������ַ-·
        return element;
    }
    
    public static WebElement householdRidge(WebDriver driver){
        element = driver.findElement(By.id("householdRidge"));//������ַ-¥��
        return element;
    }
    
    public static WebElement householdHome(WebDriver driver){
        element = driver.findElement(By.id("householdHome"));//������ַ-���ƺ�
        return element;
    }
    
    public static WebElement addreRegist(WebDriver driver){
        element = driver.findElement(By.id("addreRegist"));//�������ַ
        return element;
    }
    
    public static WebElement liveProv(WebDriver driver){
        element = driver.findElement(By.id("liveProv"));//��ס��ַ-ʡ
        return element;
    }
    
    public static WebElement liveCity(WebDriver driver){
        element = driver.findElement(By.id("liveCity"));//��ס��ַ-��
        return element;
    }
    
    public static WebElement liveTown(WebDriver driver){
        element = driver.findElement(By.id("liveTown"));//��ס��ַ-��
        return element;
    }
    
    public static WebElement liveZhen(WebDriver driver){
        element = driver.findElement(By.id("liveZhen"));//��ס��ַ-��
        return element;
    }
    
    public static WebElement liveStr(WebDriver driver){
        element = driver.findElement(By.id("liveStr"));//��ס��ַ-·
        return element;
    }
    
    public static WebElement liveRidge(WebDriver driver){
        element = driver.findElement(By.id("liveRidge"));//��ס��ַ-¥��
        return element;
    }
    
    public static WebElement liveHome(WebDriver driver){
        element = driver.findElement(By.id("liveHome"));//��ס��ַ-���ƺ�
        return element;
    }

    public static WebElement postState(WebDriver driver){
        element = driver.findElement(By.name("postState"));//�ʼĵ�ַ
        return element;
    }
    
    public static WebElement monthlyIncome(WebDriver driver){
        element = driver.findElement(By.id("monthlyIncome"));//������
        return element;
    }
    
    public static WebElement familyIncome(WebDriver driver){
        element = driver.findElement(By.id("familyIncome"));//��ͥ����
        return element;
    }
    
    public static WebElement monthlySpending(WebDriver driver){
        element = driver.findElement(By.id("monthlySpending"));//��֧��
        return element;
    }
   
    public static WebElement firstWorktime(WebDriver driver){
        element = driver.findElement(By.id("firstWorktime"));//�״ι������
        return element;
    }
    
    public static WebElement Worktime(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/table/tbody/tr/td/span[5]"));//�״ι������-���
        return element;
    }
    
    public static WebElement industry(WebDriver driver){
        element = driver.findElement(By.id("industry"));//��ҵ���
        return element;
    }
    
    public static WebElement unitname(WebDriver driver){
        element = driver.findElement(By.name("unitname"));//�ֵ�λ����
        return element;
    }
    
    public static WebElement department(WebDriver driver){
        element = driver.findElement(By.name("department"));//��ְ����
        return element;
    }
   
    public static WebElement industryType(WebDriver driver){
        element = driver.findElement(By.id("industryType"));//��ҵϸ��
        return element;
    }
    
    public static WebElement careerType(WebDriver driver){
        element = driver.findElement(By.id("careerType"));//ְҵ���
        return element;
    }
    
    public static WebElement unitPhone(WebDriver driver){
        element = driver.findElement(By.name("unitPhone"));//��λ�绰
        return element;
    }
    
    public static WebElement duty(WebDriver driver){
        element = driver.findElement(By.name("duty"));//ְλ����
        return element;
    }
  
    public static WebElement unitWorktime(WebDriver driver){
        element = driver.findElement(By.name("unitWorktime"));//�ֵ�λ����ʱ��
        return element;
    }

    public static WebElement unitAddre(WebDriver driver){
        element = driver.findElement(By.id("unitAddre"));//��λ��ַ-ʡ
        return element;
    }
    
    public static WebElement unitCity(WebDriver driver){
        element = driver.findElement(By.id("unitCity"));//��λ��ַ-��
        return element;
    }
    
    public static WebElement unitTown(WebDriver driver){
        element = driver.findElement(By.id("unitTown"));//��λ��ַ-��
        return element;
    }
    
    public static WebElement unitZhen(WebDriver driver){
        element = driver.findElement(By.name("unitZhen"));//��λ��ַ-��
        return element;
    }
    
    public static WebElement unitRidge(WebDriver driver){
        element = driver.findElement(By.name("unitRidge"));//��λ��ַ-·
        return element;
    }
    
    public static WebElement unitStr(WebDriver driver){
        element = driver.findElement(By.name("unitStr"));//��λ��ַ-¥��
        return element;
    }
    
    public static WebElement unitHome(WebDriver driver){
        element = driver.findElement(By.name("unitHome"));//��λ��ַ-���ƺ�
        return element;
    }
    
  //��ϵ����Ϣ
    public static WebElement contractType(WebDriver driver){
        element = driver.findElement(By.id("contractType_0"));//��ͥ��ϵ��
        return element;
    }
    
    public static WebElement contractname(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contractName"));//��ͥ��ϵ��-����
        return element;
    }
    
    public static WebElement contractphone(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contractPhone"));//��ͥ��ϵ��-�绰
        return element;
    }
    
    public static WebElement contractWeixin(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[0].contactWeixin"));//��ͥ��ϵ��-΢��
        return element;
    }
    
    public static WebElement uncontractType(WebDriver driver){
        element = driver.findElement(By.id("contractType_1"));//�Ǽ�ͥ��ϵ��
        return element;
    }
    
    public static WebElement uncontractname(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contractName"));//�Ǽ�ͥ��ϵ��-����
        return element;
    }
    
    public static WebElement uncontractphone(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contractPhone"));//�Ǽ�ͥ��ϵ��-�绰
        return element;
    }
    
    public static WebElement uncontractWeixin(WebDriver driver){
        element = driver.findElement(By.name("contractInfos[1].contactWeixin"));//�Ǽ�ͥ��ϵ��-΢��
        return element;
    }

    //Э����Ϣ
    public static WebElement xieshen1(WebDriver driver){
        element = driver.findElement(By.name("checkApplyInfo"));
        return element;
    }
    
    public static WebElement xieshen2(WebDriver driver){
        element = driver.findElement(By.name("mattersNeed"));
        return element;
    }
    
    public static WebElement xieshen3(WebDriver driver){
        element = driver.findElement(By.name("checkMobile"));
        return element;
    }
    
    public static WebElement xieshen4(WebDriver driver){
        element = driver.findElement(By.name("checkTel"));
        return element;
    }
    
    //������Ϣ
    public static WebElement accompany(WebDriver driver){
        element = driver.findElement(By.name("accompany"));//��ͬ����
        return element;
    }
    
    public static WebElement accApply(WebDriver driver){
        element = driver.findElement(By.name("accApply"));//��ͬ���Ƿ�����
        return element;
    }
    
    public static WebElement accName(WebDriver driver){
        element = driver.findElement(By.name("accName"));//��ͬ������
        return element;
    }
    
    public static WebElement accMobile(WebDriver driver){
        element = driver.findElement(By.name("accMobile"));//��ͬ�˵绰
        return element;
    }

    public static WebElement mobileBrand(WebDriver driver){
        element = driver.findElement(By.name("mobileBrand"));//�ͻ�ʹ���ֻ�Ʒ��
        return element;
    }

    public static WebElement stortFamKm(WebDriver driver){
        element = driver.findElement(By.name("stortFamKm"));//�ŵ����ͥסַ����
        return element;
    }
    
    public static WebElement famComKm(WebDriver driver){
        element = driver.findElement(By.name("famComKm"));//�ŵ��빤����λ����
        return element;
    }
    
    public static WebElement stortComKm(WebDriver driver){
        element = driver.findElement(By.name("stortComKm"));//��ͥסַ�빤����λ����
        return element;
    }
 
    //��֤��Ϣ
    public static WebElement userEvaluate(WebDriver driver){
        element = driver.findElement(By.name("userEvaluate"));//�ڲ�����
        return element;
    }
    
    public static WebElement userEvaluateCode(WebDriver driver){
        element = driver.findElement(By.name("userEvaluateCode"));//����
        return element;
    }
  
    public static WebElement commit(WebDriver driver){
        element = driver.findElement(By.id("save_but"));//�ύ
        return element;
    }

    public static WebElement save(WebDriver driver){
        element = driver.findElement(By.id("draft_but"));//����ݸ�
        return element;
    }
  
}

package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//TestListenerAdapter �Ѿ�ʵ�� ITestListener�������ṩ��һЩ���õķ�����
//����ֱ��ȡ���гɹ�ʧ���������ֲ��Խ���Ĳ��Է����ķ��������� ITestListner 
//���кܶ෽���� TestListenerAdapter �Ѹ�����Ĭ��ʵ�֡�
//��ˣ��̳� TestListenerAdapter �󣬱�ֻ���ע��Ҫ�޸ĵķ�����
public class myListener extends TestListenerAdapter{
     
    @Override // @Override��α����,��ʾ��д(��Ȼ��дҲ����)
    public void onTestFailure(ITestResult tr) {
        log(tr.getName()+ "--ִ��ʧ��\n");
    }
     
    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr.getName()+ "--ִ������\n");
    }
     
    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr.getName()+ "--ִ�гɹ�\n");
    }
     
    private void log(String string) {
       System.out.print(string);
    }

}
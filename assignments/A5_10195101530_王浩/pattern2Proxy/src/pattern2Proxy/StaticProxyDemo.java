package pattern2Proxy;

//��̬����ģʽ
public class StaticProxyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ʵ�ʶ���
		SubjectImpl subject = new SubjectImpl();

		
		//ʵ�ʶ����װ�����������
		StaticProxy p = new StaticProxy(subject);
		p.request();
	}
}

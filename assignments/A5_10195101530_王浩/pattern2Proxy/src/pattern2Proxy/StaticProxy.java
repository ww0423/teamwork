package pattern2Proxy;
//�������
class StaticProxy implements Subject{
	//ʵ��Ŀ�����
	private Subject subject;
	
	public StaticProxy(Subject subject) {
		this.subject = subject;
	}
	
	public void request() {
		System.out.println("PreProcess");
		subject.request();
		System.out.println("PostProcess");
	}
	
	
}

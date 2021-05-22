package pattern2Proxy;
//代理对象
class StaticProxy implements Subject{
	//实际目标对象
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

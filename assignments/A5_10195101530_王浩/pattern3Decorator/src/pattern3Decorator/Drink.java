package pattern3Decorator;

public abstract class Drink {
	protected String desc;
	
	public String getDesc() {
		return desc;
	}
	
	//����
	public abstract double cost();
}

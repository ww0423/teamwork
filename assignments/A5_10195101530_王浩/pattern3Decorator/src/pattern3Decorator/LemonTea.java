package pattern3Decorator;

public class LemonTea extends Drink{
	 
	public LemonTea() {
		desc = "���ʲ�";
	}
 
	@Override
	public double cost() {
		return 10;
	}
 
}
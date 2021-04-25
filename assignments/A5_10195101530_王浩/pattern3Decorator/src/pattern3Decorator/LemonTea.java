package pattern3Decorator;

public class LemonTea extends Drink{
	 
	public LemonTea() {
		desc = "ÄûÃÊ²è";
	}
 
	@Override
	public double cost() {
		return 10;
	}
 
}
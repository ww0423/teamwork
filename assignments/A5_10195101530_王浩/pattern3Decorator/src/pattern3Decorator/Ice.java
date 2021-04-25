package pattern3Decorator;

public class Ice extends Condiment{
	 
	private Drink drink;
	
	public Ice(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDesc() {
		return drink.getDesc() + "+" + "±ù";
	}
 
	@Override
	public double cost() {
		return 0.4+drink.cost();
	}
}
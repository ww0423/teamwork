package pattern3Decorator;

public class Sugar extends Condiment{
	
	private Drink drink;
	
	public Sugar(Drink drink) {
		this.drink = drink;
	}
 
	@Override
    public String getDesc() {
    	return drink.getDesc() + "+" + "��";
    }
	
	@Override
	public double cost() {
		return 0.5+drink.cost();
	}
 
}

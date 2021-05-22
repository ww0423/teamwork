package pattern3Decorator;

public class DecoratorTest {
	 
	public static void main(String[] args) {
		Drink milkTea = new MilkTea();
		double cost = milkTea.cost();
		System.out.println(milkTea.getDesc()+":"+cost+"Ԫ");
		
		System.out.println("----------------");
		
		//�̲���Ǽӱ�
		Drink milkTea2 = new MilkTea();
		milkTea2 = new Ice(new Sugar(milkTea2));
		double cost2 = milkTea2.cost();
		System.out.println(milkTea2.getDesc()+":"+cost2+"Ԫ");
		
		System.out.println("----------------");
		
		//���ʲ�����ݱ�
		Drink lemonTea = new LemonTea();
		lemonTea = new Ice(new Ice(lemonTea));
		double cost3 = lemonTea.cost();
		System.out.println(lemonTea.getDesc()+":"+cost3+"Ԫ");
	}
 
}

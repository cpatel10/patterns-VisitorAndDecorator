package p3Decorator;

public class FruitDecorator extends FroyoDecorator{

	public FruitDecorator(Froyo specialFroyo) {
		super(specialFroyo);
		
	}

	
	public String makeFroyo(){
		return specialFroyo.makeFroyo() + addFruits(); 
	

}
	private String addFruits(){
		return "+ Strawberry and Blueberries ";
	}
	
	public double getCost(){
		System.out.println("Cost of fruit:"+ 1.00);
		return specialFroyo.getCost()+ 1.00;
	}

}


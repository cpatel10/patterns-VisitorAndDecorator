package p3Decorator;

public class SauceDecorator extends FroyoDecorator{

	public SauceDecorator(Froyo specialFroyo) {
		super(specialFroyo);
		
	}
	
	public String makeFroyo(){
		return specialFroyo.makeFroyo() + addSauce(); 
	

}
	private String addSauce(){
		return "+ Hot Fudge and Caramel ";
	}
	
	public double getCost(){
		System.out.println("Cost of sauces:"+ .50);
		return specialFroyo.getCost()+ .50;
	}

}





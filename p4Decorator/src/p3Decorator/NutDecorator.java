package p3Decorator;

public class NutDecorator extends FroyoDecorator {

	public NutDecorator(Froyo specialFroyo) {
		super(specialFroyo);
		
	}
	
	public String makeFroyo(){
		return specialFroyo.makeFroyo() + addNuts(); 
	

}
	private String addNuts(){
		return "+ Almonds and Peanuts ";
	}
	
	public double getCost(){
		System.out.println("Cost of Nuts: "+ 2.00);
		return specialFroyo.getCost()+ 2.00;
	}

}





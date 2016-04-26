package p3Decorator;

public abstract class FroyoDecorator implements Froyo {

	protected Froyo specialFroyo;
	
	public FroyoDecorator(Froyo specialFroyo){
		this.specialFroyo= specialFroyo;
	}
	
	@Override
	public String makeFroyo() {
		
		return specialFroyo.makeFroyo();
	}

	@Override
	public double getCost() {
		
		return specialFroyo.getCost();
	}

}

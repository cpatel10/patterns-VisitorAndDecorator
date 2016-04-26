package p3Decorator;

public class SimpleFroyo implements Froyo {
     private double cost = 5.00;
	@Override
	public String makeFroyo() {
		return "Base Froyo";
			}

	@Override
	public double getCost() {
		return cost;

	}
	
	public void setCost(double newCost){
		cost= newCost;
	}

}

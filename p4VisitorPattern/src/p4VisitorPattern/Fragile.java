package p4VisitorPattern;

public class Fragile implements Visitable{
	private double weight;
	
	Fragile(double item){
		weight= item;
		
	}
	
	public double accept(Visitor visitor){
		return visitor.visit(this);
	}
	
	public double getWeight(){
		return weight;
	}

}

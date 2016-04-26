package p4VisitorPattern;

public class Envelope {
private double weight;
	
	Envelope(double item){
		weight= item;
		
	}
	
	public double accept(Visitor visitor){
		return visitor.visit(this);
	}
	
	public double getWeight(){
		return weight;
	}


}

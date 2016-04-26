package p4VisitorPattern;

public class Parcel {
private double weight;
	
	Parcel(double item){
		weight= item;
		
	}
	
	public double accept(Visitor visitor){
		return visitor.visit(this);
	}
	
	public double getWeight(){
		return weight;
	}


}

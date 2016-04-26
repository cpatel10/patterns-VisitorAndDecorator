package p4VisitorPattern;

public class PostageVisitor implements Visitor {
	
	public PostageVisitor(){}

	@Override
	public double visit(Fragile fragileItem) {
		System.out.println("Fragile Item: Postage Price");
		return (fragileItem.getWeight()* 2.00);
	}

	@Override
	public double visit(Envelope smallItem) {
		System.out.println("Small Item: Postage Price");
		return (smallItem.getWeight()* 0.50);
	
	}

	@Override
	public double visit(Parcel bigItem) {
		System.out.println("Big Item: Postage Price");
		return (bigItem.getWeight()* 1.50);
	
	}
	

}

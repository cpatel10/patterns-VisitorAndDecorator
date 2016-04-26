package p4VisitorPattern;

public class DiscountPostageVisitor implements Visitor {

	public DiscountPostageVisitor(){}
	
	@Override
	public double visit(Fragile fragileItem) {
		System.out.println("Fragile Item: Postage Price");
		return (fragileItem.getWeight()* 1.50);
	}

	@Override
	public double visit(Envelope smallItem) {
		System.out.println("Small Item: Postage Price");
		return (smallItem.getWeight()* 0.30);
	}

	@Override
	public double visit(Parcel bigItem) {
		System.out.println("Big Item: Postage Price");
		return (bigItem.getWeight()* 1.00);
	}

}

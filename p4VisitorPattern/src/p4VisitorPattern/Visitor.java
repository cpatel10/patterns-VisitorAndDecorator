package p4VisitorPattern;

public interface Visitor {
	
	public double visit(Fragile fragileItem);
	public double visit(Envelope smallItem);
	public double visit(Parcel bigItem);

}

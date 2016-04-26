package p4VisitorPattern;

public class TestMainVisitor {
	
	
	public static void main(String[] args) {
		
	
	PostageVisitor postCalc =new PostageVisitor();
	DiscountPostageVisitor discPostCalc= new DiscountPostageVisitor();
	
	Fragile dinnerSet = new Fragile(5.50);
	Parcel bed = new Parcel(10.50);
	Envelope letter = new Envelope(0.20);
	
	System.out.println(dinnerSet.accept(postCalc) + "\n");
	System.out.println(bed.accept(postCalc) + "\n");
	System.out.println(letter.accept(postCalc) + "\n");
	
	System.out.println("Discounted Postage Prices\n");
	
	System.out.println(dinnerSet.accept(discPostCalc) + "\n");
	System.out.println(bed.accept(discPostCalc) + "\n");
	System.out.println(letter.accept(discPostCalc) + "\n");
	

}
}
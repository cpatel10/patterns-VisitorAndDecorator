package p3Decorator;

public class TestMainDecorator {
	
	public static void main(String args[]){
		
		Froyo froyo1= new FruitDecorator(new NutDecorator(new SimpleFroyo()));
		System.out.println(froyo1.makeFroyo());
		System.out.println("The total cost of the Froyo is : " + froyo1.getCost());
		
		
		Froyo froyo2= new SauceDecorator(new NutDecorator(new SimpleFroyo()));
		System.out.println(froyo2.makeFroyo());
		System.out.println("The total cost of the Froyo is : " + froyo2.getCost());
	}

}

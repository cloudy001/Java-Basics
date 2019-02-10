package Basics_in_Java;

public class Car {
	
	String name ;

	//neue name weil man gibt jedes mal ein neues Auto name
	public Car( String neueName) {
		
		this.name = neueName;
	}
	public String getName() {
		return name;
	}
	
	public void start () {
		
		System.out.println("Car is started, woom woom woooooommmmmm");
	}
	
	
	public static void main(String[] args) {
		Car bmw  = new Car("x5") ;
		System.out.println(bmw.getName());
		
		bmw.start();
		

	}

}

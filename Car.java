package week1.day2;

public class Car {

	public boolean applyBreak(){
		return false;
	}
	
	public short applyGear(){
		return 4;
		
	}
	
	public String switvhOnAc(){
		String limit="low";
		return limit;
		
	}
	
	public int applyAccelerate(){
		int km=60;
		return km;
	}
	
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.applyBreak();
		c.applyGear();
		c.switvhOnAc();
		c.applyAccelerate();
		
		

	}

}

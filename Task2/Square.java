package Task2;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double s, String c, boolean f) {
		super(s, s, c, f);
	}
	
	/**GETTER SETTER*/
	public double getSide() {
		return super.getWidth();
	}
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public double getArea() {
		return getSide()*getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}
	
	@Override
	 public String toString() { // in Cylinder class
		 return "A Square with side = " + getSide() + " which is a subclass of " + super.toString(); // use Circle's toString()
	 }
	
}

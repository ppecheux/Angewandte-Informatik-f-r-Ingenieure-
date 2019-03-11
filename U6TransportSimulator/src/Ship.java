
public class Ship implements CanMoveHorizontally {
	
	private double x;
	private double y;
	private double by;
	private double winkel;
	private final String name;
	
	
	Ship(String name,double x,double y){
		this.name=name;
		this.setX(x);
		this.setY(y);
	}

	@Override
	public void move() {
		this.y= Math.sin(this.winkel)*this.by;
		this.x= Math.cos(this.winkel)*this.by;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		this.by+=by;	
	}

	@Override
	public void turnBy(double radians) {
		this.setWinkel(this.getWinkel() + radians);
		
	}
	
	@Override
	public String toString(){
		return "ship:" + getName() +" is at the position: " + getX() +"x and " +getY()+"y and at the speed: "+ getBy();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getBy() {
		return by;
	}

	public void setBy(double by) {
		this.by = by;
	}

	public double getWinkel() {
		return winkel;
	}

	public void setWinkel(double winkel) {
		this.winkel = winkel;
	}
	

}

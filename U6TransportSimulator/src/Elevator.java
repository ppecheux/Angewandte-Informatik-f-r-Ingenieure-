
public class Elevator implements CanMoveVertically {
	
	private final String name;
	private double z;
	private double by;
	
	Elevator(String name, double z){
		this.name=name;
		this.setZ(z);
	}

	@Override
	public void move() {
		setZ(z+getBy());
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		setBy(this.by+by);
	}
	
	public String toString(){
		return "elevator:" + getName() +" is at the level: " + getZ() +" at the speed: "+ getBy();
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getBy() {
		return by;
	}

	public void setBy(double by) {
		this.by = by;
	}

}

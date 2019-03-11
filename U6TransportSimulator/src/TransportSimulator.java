
public class TransportSimulator {
	
	Movable[] passagerFleet = new Movable[10];
	
	void increaseSpeedByRandom(Movable mov){
		if(mov instanceof CanMoveHorizontally) {
			CanMoveHorizontally horizonMov = (CanMoveHorizontally) mov;
			horizonMov.increaseHorizontalSpeed(23);
		}
		if(mov instanceof CanMoveVertically) {
			CanMoveVertically horizonMov = (CanMoveVertically) mov;
			horizonMov.increaseVerticalSpeed(23);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

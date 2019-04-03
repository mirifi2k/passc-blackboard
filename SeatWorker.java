package blackboard;

public class SeatWorker extends Worker {
	private static final int DELAY_TIME = 1000;
	
	public SeatWorker(String name, Blackboard blackboard) {
		super(name, blackboard);
	}

	public void stop() {
		super.stop();
	}
	
	@Override
	public boolean check(ChairInProgress chair) {
		return chair.hasSeat();
	}

	@Override
	public void execAction(ChairInProgress chair) {
		chair.setSeat();
		System.out.println("Chair " + chair + " seat was assembled by " + this);
		sleep(DELAY_TIME);
	}

	@Override
	public boolean execCond(ChairInProgress chair) {
		return !chair.hasSeat();
	}
	
	@Override
	public String toString() {
		return "Seat Worker " + super.toString();
	}
}

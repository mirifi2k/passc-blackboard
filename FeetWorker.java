package blackboard;

public class FeetWorker extends Worker {
	private static final int DELAY_TIME = 4000;
	
	public FeetWorker(String name, Blackboard blackboard) {
		super(name, blackboard);
	}
	
	public void stop() {
		super.stop();
	}

	@Override
	public boolean check(ChairInProgress chair) {
		return chair.hasFeet();
	}

	@Override
	public void execAction(ChairInProgress chair) {
		chair.setFeet();
		System.out.println("Chair " + chair + " feet was assembled by " + this);
		sleep(DELAY_TIME);
	}

	@Override
	public boolean execCond(ChairInProgress chair) {
		return chair.hasSeat() && !chair.hasFeet();
	}
	
	@Override
	public String toString() {
		return "Feet Worker " + super.toString();
	}
}

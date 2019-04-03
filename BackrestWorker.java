package blackboard;

public class BackrestWorker extends Worker {
	private static final int DELAY_TIME = 1500;
	
	public BackrestWorker(String name, Blackboard blackboard) {
		super(name, blackboard);
	}
	
	public void stop() {
		super.stop();
	}

	@Override
	public boolean check(ChairInProgress chair) {
		return chair.hasBackrest();
	}

	@Override
	public void execAction(ChairInProgress chair) {
		chair.setBackrest();
		System.out.println("Chair " + chair + " backrest was assembled by " + this);
		
		sleep(DELAY_TIME);
	}

	@Override
	public boolean execCond(ChairInProgress chair) {
		return chair.hasSeat() && chair.hasFeet() && !chair.hasBackrest();
	}
	
	@Override
	public String toString() {
		return "Backrest Worker " + super.toString();
	}
}

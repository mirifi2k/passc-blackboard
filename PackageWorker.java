package blackboard;

public class PackageWorker extends Worker {
	private static final int DELAY_TIME = 1000;
	
	public PackageWorker(String name, Blackboard blackboard) {
		super(name, blackboard);
	}
	
	public void stop() {
		super.stop();
	}

	@Override
	public boolean check(ChairInProgress chair) {
		return chair.isPacked();
	}

	@Override
	public void execAction(ChairInProgress chair) {
		chair.pack();
		System.out.println("Chair " + chair + " was packed by " + this);
		sleep(DELAY_TIME);
	}

	@Override
	public boolean execCond(ChairInProgress chair) {
		return chair.hasSeat() && chair.hasFeet() && chair.hasBackrest() && chair.hasStabilizerBar() && !chair.isPacked();
	}
	
	@Override
	public String toString() {
		return "Packaging Worker " + super.toString();
	}
}

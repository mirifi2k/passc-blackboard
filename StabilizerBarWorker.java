package blackboard;

public class StabilizerBarWorker extends Worker {
	private static final int DELAY_TIME = 2000;
	
	public StabilizerBarWorker(String name, Blackboard blackboard) {
		super(name, blackboard);
	}
	
	public void stop() {
		super.stop();
	}
	
	@Override
	public boolean check(ChairInProgress chair) {
		return chair.hasStabilizerBar();
	}

	@Override
	public void execAction(ChairInProgress chair) {
		chair.setStabilizerBar();
		System.out.println("Chair " + chair + " stabilizer bar was assembled by " + this);
		sleep(DELAY_TIME);
	}

	@Override
	public boolean execCond(ChairInProgress chair) {
		return chair.hasSeat() && chair.hasFeet() && chair.hasBackrest() && !chair.hasStabilizerBar();
	}
	
	@Override
	public String toString() {
		return "Stabilizer Bar Worker " + super.toString();
	}
}

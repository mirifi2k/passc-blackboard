package blackboard;

public abstract class Worker extends WorkerThread {
	private Blackboard blackboard;
	private String name;
	
	public Worker(String name, Blackboard blackboard) {
		this.blackboard = blackboard;
		this.name = name;
	}
	
	@Override
	public void run() {
		ChairInProgress chair;
		
		while (!blackboard.workDone(this)) {  // this worker finished his work on all the chairs on the blackboard
			if ((chair = blackboard.getFreeChair(this)) != null) { // get a chair that is not busy (another worker working on it)
				System.out.println(this + " is working on a chair.");
				
				this.execAction(chair);
				chair.setBusy(false); // chair is now back on the blackboard
			}
		}
		
		System.out.println(this + " finished all of his work.");
	}
	
	public abstract boolean check(ChairInProgress chair);
	public abstract boolean execCond(ChairInProgress chair);
	public abstract void execAction(ChairInProgress chair);
	
	@Override
	public String toString() {
		return name;
	}
}

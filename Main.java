package blackboard;

public class Main {
	public static void main(String[] args) {
		Blackboard blackboard = new Blackboard(5);
		Control control = new Control(blackboard);
		
		control.add(new SeatWorker("Ion", blackboard));
		control.add(new FeetWorker("George", blackboard));
		control.add(new BackrestWorker("Vasile", blackboard));
		control.add(new StabilizerBarWorker("Mihai", blackboard));
		control.add(new PackageWorker("Andrei", blackboard));
		
		control.start();
	}
}

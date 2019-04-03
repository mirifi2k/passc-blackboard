package blackboard;
import java.util.List;
import java.util.ArrayList;

public class Control {
	// private Blackboard blackboard;
	private List<Worker> workers;
	
	public Control(Blackboard blackboard) {
		this.workers = new ArrayList<Worker>();
		// this.blackboard = blackboard;
	}
	
	public void add(Worker w) {
		workers.add(w);
	}
	
	public void start() {
		for (Worker w : workers) {
			w.start();
		}
	}
}

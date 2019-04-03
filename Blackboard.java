package blackboard;

import java.util.ArrayList;

public class Blackboard {
	private ArrayList<ChairInProgress> chairs;
	private int chairsCount;
	
	public Blackboard(int count) {
		chairsCount = count;
		chairs = new ArrayList<ChairInProgress>();
		this.addChairs();
	}
	
	public void addChairs() {
		for (int i = 0; i < chairsCount; i++)
			chairs.add(new ChairInProgress());
	}
	
	public boolean workDone(Worker w) {
		if (chairs.size() != chairsCount)
			return false;
		
		else {
			for (ChairInProgress c : chairs) {
				if (w.check(c))
					continue;
				
				return false;
			}
		}
		
		return true;
	}
	
	public ChairInProgress getFreeChair(Worker w) {
		for (ChairInProgress c : chairs) {
			if (!c.busy() && w.execCond(c)) {
				c.setBusy(true);
				return c;
			}
		}
		
		return null;
	}
}

package blackboard;

public class ChairInProgress {
	private boolean busy;
	private boolean hasSeat, hasBackrest, hasStabilizerBar, hasFeet, isPacked;
	private static int count = 0;
	private int id;
	
	public ChairInProgress() {
		id = count ++;
	}
	
	public void setBusy(boolean busy) {
		this.busy = busy;
	}
	
	public void setSeat() {
		hasSeat = true;
	}
	
	public void setBackrest() {
		hasBackrest = true;
	}
	
	public void setStabilizerBar() {
		hasStabilizerBar = true;
	}
	
	public void setFeet() {
		hasFeet = true;
	}
	
	public void pack() {
		isPacked = true;
	}
	
	public boolean busy() {
		return this.busy;
	}
	
	public boolean hasSeat() {
		return this.hasSeat;
	}
	
	public boolean hasBackrest() {
		return this.hasBackrest;
	}
	
	public boolean hasStabilizerBar() {
		return this.hasStabilizerBar;
	}
	
	public boolean isPacked() {
		return this.isPacked;
	}
	
	public boolean hasFeet() {
		return this.hasFeet;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "ID: " + id;
	}
}

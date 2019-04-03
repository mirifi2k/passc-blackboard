package blackboard;

public abstract class WorkerThread implements Runnable {
	private boolean started;
	private Thread thread;
	
	public WorkerThread() {
		this.started = false;
		this.thread = new Thread(this);
	}
	
	public void start() {
		if (!started) {
			System.out.println("A worker thread is starting ...");
			started = true;
			thread.start(); // run() method
		}
	}
	
	public void stop() {
		if (started) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			started = false;
		}
	}
	
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isStarted() {
		return this.started;
	}
}


public class FortuneCookie implements Runnable {
	
	private String first;
	private String last;
	private int sleepyTime;
	
	public FortuneCookie(String first, String last, int sleepyTime) {
		this.first = first; 
		this.last = last; 
		this.sleepyTime = sleepyTime;
	}
	
	public void run() {
		
		
		while(true) {
			
			Thread.yield();
			
			System.out.println(first);
			try {
				Thread.sleep(sleepyTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(last);
		}
	}

}

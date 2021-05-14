
public class Producer extends Thread {
	
	private Cup cup;
	private int number;
	
	public Producer(Cup c, int number) {
		setCup(c);
		this.setNumber(number);
		
		
	}

	public void run() {
		
		for (int i = 0; i < 10; i++);
		
		try {
			sleep((long) (Math.random() * 100));
		} catch (InterruptedException e) {
			
		}
		
	}

	public Cup getCup() {
		return cup;
	}

	public void setCup(Cup cup) {
		this.cup = cup;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}

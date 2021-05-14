
import java.util.Scanner;


public class FirstThreads {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		FortuneCookie cookie1 = new FortuneCookie("You will always ", " Travel to interesting places", 1000);
		
		FortuneCookie cookie2 = new FortuneCookie("Never expect ", " lots of money to come to you", 1200);
		
		cookie1.start();
		cookie2.start();
		
		Fortune myfortuneThread = new Fortune();
		
		//myfortuneThread.setDaemon(false); // Daemon or User 
		//myfortuneThread.start();
		
		System.out.println("Enter anything: ");
		input.next();
		
		System.out.println("Input request was satisfied in main");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I slept for 2 seconds");
	}

	
	
}

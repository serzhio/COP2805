import java.util.Scanner;

public class FirstThreads {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		new Thread(new Runnable() { // Anonymous Class
			public void run() {
				System.out.println("In anon inner class");
				System.out.println("In anon inner class");
				System.out.println("In anon inner class");
				System.out.println("In anon inner class");

			}

		}

		).start();

		// FortuneCookie cookie1 = new FortuneCookie("You will always ",
		// "Travel to interesting places", 1000);
		// FortuneCookie cookie2 = new FortuneCookie("Never expect",
		// " lots of money to come to you", 1200);

		Thread cookie1 = new Thread(new FortuneCookie("You will always ",
				"Travel to interesting places", 1000));
		Thread cookie2 = new Thread(new FortuneCookie("Never expect",
				" lots of money to come to you", 1200));

		cookie1.start();
		cookie2.start();
		
		// cookie1.suspend(); 

		// cookie1.setPriority(Thread.MAX_PRIORITY);
		// cookie2.setPriority(Thread.MIN_PRIORITY);

		// try {
		// cookie1.join(); //Main thread will wait for cookie1 to finish
		// } catch (InterruptedException e1) {
		// e1.printStackTrace();
		// }

		Fortune myFortuneThread = new Fortune();

		// myFortuneThread.setDaemon(false);
		// myFortuneThread.start();

		System.out.println("Enter Anything");

		input.next();

		System.out.println("The input was satisfied in main");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("I slept for 3 seconds.");
	}

}

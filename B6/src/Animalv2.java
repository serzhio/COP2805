
public class Animalv2 implements Runnable {

	private String name;
	private int position; 
	private int speed;
	private int restMax; //time between rests
	
	private static boolean winner; 
	private static int distance; 
	private static Food sharedFood; 
	
	public Animalv2(String name, int speed, int restMax, Food food) {
		
		this.position = 0;
		this.name = name;
		this.speed = speed; 
		this.restMax = restMax; 
		
		this.winner = false; 
		this.distance = 100;
		this.sharedFood = food;
	}
	
	public void run() {
		
		while(!this.winner) {
			
			this.position += this.speed;
			
			System.out.println(name + " is running! ");
			System.out.println(name + " Postion: " + this.position);
			
			try {
				Thread.sleep((long)Math.random() * (this.restMax + 1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (this.name.equals("Rabbit")) 
				this.sharedFood.eat(3000, this.name);
			if (this.name.equals("Turtle"))
				this.sharedFood.eat(1500, this.name);
			
			if (this.position >= this.distance) {
				this.winner = true;
				
				System.out.println(this.name + " is the winner!");
			}
			
			
		}
		
	}
}

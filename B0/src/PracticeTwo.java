
public class PracticeTwo {
	
	public static void main(String[] args) {
	    
//	    Outer o = new Outer();
//	    Inner i = new Inner();
//	    int n = 10; 
//	    i.setX(n); 
//	    o.setY(i);
//	    
//	    i.setX(100);
//	    
//	    System.out.println(o.getY().getX());
//	    
//	    ItemTest fa = new ItemTest(42); 
//	    //fa.updateId(69);
//	    System.out.println(fa.getID());
	    
	    Item it = new Item(); 
	    it.setDescription("Gobstopper");
	    Item it2 = new Item(); 
	    it2.setDescription("Fizzly");
	    Item.modifyDesc(it, "Scrumpataphdfa");
	    System.out.println(it.getDescription());
	    System.out.println(it2.getDescription());
	}


}
class Item {
    private String desc; 
    public String getDescription() {
	return desc;
    }
    public void setDescription(String d) { desc = d; }
    
    public static void modifyDesc(Item item, String desc) { 
	item = new Item(); 
	item.setDescription(desc);
    }
}

class ItemTest {
    private final int id; 
    public ItemTest(int id) {
	this.id = id;
    }
    public void updateId(int newID) {
	//id = newID;
    }
    public int getID() {
	return id;
    }
    
}

class Inner {
    private int x;
    public void setX(int x) {
	this.x = x; 
    }
    public int getX() {
	return x; 
    }
}
class Outer {
    private Inner y; 
    public void setY(Inner y) {
	this.y = y;
    }
    public Inner getY(){
	return y; 
    }
}
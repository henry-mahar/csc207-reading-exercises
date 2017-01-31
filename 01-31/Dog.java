
public class Dog {
	public int hunger;
	public int weight;
	public int happiness;
	
	public Dog(int weight) {
		this.hunger = 60;
		this.weight = weight;
		this.happiness = 100;
	}
	
	public void feed() {
		this.hunger += 10;
		if (this.hunger > 100) {
			System.out.println("The dog is full.");
		}
	}
}

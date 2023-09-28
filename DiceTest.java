package week5_project;
import java.util.Random;

class Dice {
	Random random = new Random();
	private int value;
	public Dice() {
		value = 0;
	}
	public void roll() {
		this.value = random.nextInt(6) + 1;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	
}
public class DiceTest {

	public static void main(String[] args) {
		//202221226 장민채
		
		Dice firstDice = new Dice();
		Dice secondDice = new Dice();
		int count = 0;
		
		while(true) {
			firstDice.roll();
			secondDice.roll();
			count++;
			
			System.out.println("Dice 1: " + firstDice.getValue() +
					" Dice 2: " + secondDice.getValue());
			if((firstDice.getValue() + secondDice.getValue()) == 2) {
				System.out.println("(1, 1)이 나오는데 걸린 횟수: " + count);
				break;
			}
		}
		
	}

}

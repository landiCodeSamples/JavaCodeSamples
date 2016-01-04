package rpgDecorator;

public class Mage extends Character {
	private int exp;
	
	public Mage(){chDesc = "Mage Character";}
	
	public int level(){return 1;}
	
	public void setExp(int exp){this.exp = exp;}
	
	public int getExp(){return this.exp;}
}

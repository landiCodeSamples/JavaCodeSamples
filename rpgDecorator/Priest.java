package rpgDecorator;

public class Priest extends Character {
	private int exp;
	
	public Priest(){chDesc = "Priest Character";}
	
	public int level(){return 1;}
	
	public void setExp(int exp){this.exp = exp;}
	
	public int getExp(){return this.exp;}
}

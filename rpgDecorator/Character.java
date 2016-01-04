package rpgDecorator;

public abstract class Character {
	String chDesc = "NA";
	int exp = 0;
	
	public String getChDecs(){return this.chDesc;}
	
	public abstract int level();
	
	public void setExp(int exp){this.exp = exp;}
	
	public int getExp(){return this.exp;}
}

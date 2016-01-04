package rpgDecorator;

public class IcyAmulet extends ItemDecorator {
	Character ch;
	
	public IcyAmulet(Character ch){
		this.ch = ch;
	}
	
	public String getChDecs(){
		return ch.getChDecs() + ": " + "Malefic Mask of the Shadows";
	}
	
	public int level(){
		int expNeeded = 300;
		if(ch.getExp() == expNeeded){return ch.level() + 1;}	
		else{System.out.println("You do not have enough exp: " + ch.getExp());}
		return ch.level();
	}
}

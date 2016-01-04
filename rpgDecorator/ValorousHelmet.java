package rpgDecorator;

public class ValorousHelmet extends ItemDecorator {
	Character ch;
	
	public ValorousHelmet(Character ch){
		this.ch = ch;
	}
	
	public String getChDecs(){
		return ch.getChDecs() + ": " + "Valorous Bonescthe Helmet";
	}
	
	public int level(){
		int expNeeded = 100;
		if(ch.getExp() == expNeeded){return 1;}	
		else{System.out.println("You do not have enough exp: " + ch.getExp());}
		return 0;
	}
}

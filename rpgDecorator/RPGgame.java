package rpgDecorator;

import java.io.Console;
import java.util.Scanner;

public class RPGgame {
	private static boolean isQuestOneComplete = false;
	private static boolean isQuestTwoComplete = false;
	private static boolean isQuestThreeComplete = false;
	private static boolean isQuestFourComplete = false;
	private static boolean isQuestFiveComplete = false;
	
	public static void main(String args[]){
		int usrInput;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for mage or 2 for Priest");
		usrInput = input.nextInt();
		if(usrInput == 1){
			Character ch = new Mage();
			setUsrSlelectedCharacter(ch);
		}
		else{
			Character ch = new Priest();
			setUsrSlelectedCharacter(ch);
		}
		
		
	}
	
	public static void setUsrSlelectedCharacter(Character character){
		System.out.println("Character selected: " + character.getChDecs());
		System.out.println("You will start out with " + character.getExp() + " experience points");
		System.out.println("For each completed quest you will gain 100 experience points. " + "\n" +
						   "There are 5 levels each containing a magical item.");
		
		questOne(character);	
		if(isQuestOneComplete){
			character = new ValorousHelmet(character);
			System.out.println("Quest 1 completed");
			System.out.println("You are now a  " + "level " +  character.level() +
					" " + character.getChDecs());
			questTwo(character);
		}
		if(isQuestTwoComplete){
			character = new MagicMask(character);
			System.out.println("Quest 2 completed");
			System.out.println("You are now a  " + "level " +  character.level() + "\n" +
					" " + character.getChDecs());
			questThree(character);
		}
		
		if(isQuestThreeComplete){
			character = new IcyAmulet(character);
			System.out.println("Quest 3 completed");
			System.out.println("You are now a  " + "level " +  character.level() + "\n" +
					" " + character.getChDecs());
			questFour(character);
		}
		
		if(isQuestFourComplete){
			character = new Necklace(character);
			System.out.println("Quest 4 completed");
			System.out.println("You are now a  " + "level " +  character.level() + "\n" +
					" " + character.getChDecs());
			questFive(character);
		}
		if(isQuestFiveComplete){
			character = new PendantOfTriumph(character);
			System.out.println("Quest 5 completed");
			System.out.println("You are now a  " + "level " +  character.level() + "\n" +
					" " + character.getChDecs());
		}
	}
	
	public static void questOne(Character ch){
		String usrInput = "";
		System.out.println("Quest 1");
		while(ch.getExp() < 100){
			Scanner input1 = new Scanner(System.in);
			System.out.println("true or false: Is the decorator pattern also known " +
									"as Wrapper");
			usrInput = input1.nextLine();
			
			if(usrInput.equals("true")){
				ch.setExp(ch.getExp() + 25);
				System.out.println(ch.chDesc + "you have gained 25 exp");
			}		
			else{
				ch.setExp(ch.getExp() - 25);
			}
		
			System.out.println("true or false: The decorator pattern can be used to extend the " +
									"functionality of a certain object statically");
			usrInput = input1.nextLine();
			if(usrInput.equals("true")){
				ch.setExp(ch.getExp() + 75);
				System.out.println(ch.chDesc + "you have gained 75 exp");
			}
			System.out.println(ch.getExp());
		}		
		isQuestOneComplete = true;
		
	}
	
	public static void questTwo(Character ch){
		
		String usrInput = "";
		System.out.println("Quest 2");
		while(ch.getExp() < 200){
			Scanner input2 = new Scanner(System.in);
			System.out.println("true or false: abstract class is favored over inheritance ");
			usrInput = input2.nextLine();
			System.out.println(ch.getExp());
			if(usrInput.equals("true")){
				ch.setExp(200);
				System.out.println("you have gained 100 exp");
			}		
			System.out.println(ch.getExp());
		}		
		isQuestTwoComplete = true;
		
	}

	public static void questThree(Character ch){
		String usrInput = "";
		System.out.println("Quest 3");
		while(ch.getExp() < 300){
			Scanner input3 = new Scanner(System.in);
			System.out.println("true or false: The point of singalton pattern is to have one object ");
			usrInput = input3.nextLine();
			
			if(usrInput.equals("true")){
				ch.setExp(300);
				System.out.println("you have gained 100 exp");
			}		
		}		
		isQuestThreeComplete = true;
	
		
	}

	public static void questFour(Character ch){
		String usrInput = "";
		System.out.println("Quest 4");
		while(ch.getExp() < 400){
			Scanner input4 = new Scanner(System.in);
			System.out.println("true or false: The best way to compair string is with == ");
			usrInput = input4.nextLine();
			
			if(usrInput.equals("false")){
				ch.setExp(400);
				System.out.println("you have gained 100 exp");
			}		
		}		
		isQuestFourComplete = true;
	
		
	}

	public static void questFive(Character ch){
		String usrInput = "";
		System.out.println("Quest 5");
		while(ch.getExp() < 500){
			Scanner input5 = new Scanner(System.in);
			System.out.println("true or false: This is the last quest ");
			usrInput = input5.nextLine();			
			if(usrInput.equals("true")){
				ch.setExp(500);
				System.out.println("you have gained 100 exp");
			}		
		}		
		isQuestFiveComplete = true;
	
		
	}	
}

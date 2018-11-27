package main;

import gen.Menu;
import gen.Setup;
import main.entities.Enemy;
import main.entities.Player;
import main.items.*;

	/*
	 * 
	 * 
	 * TODO:
	 * 	1) Implement "map" maker
	 *	2) Implement battle mechanic
	 *	3) Implement events and such
	 * 	4) Add merchants and stuff
	 *
	 */

public class Everything /*extends JFrame implements ActionListener*/ {
	
	public static Player player;
	static Enemy enemy;
	public static int position = 0;
	private static int floor = 1;
	
	public static int hallLength;
	static int floorNumber;

	public static void incrementPosition() {
		position++;
	}
	public static int getPosition() {
		return position;
	}

	public static void main(String[] args) {
		hallLength = Setup.Flip(10) + 10; //Minimum hall length = 11, max 20, at end = stairs
		floorNumber = Setup.Flip(3) + 2; //Minimum length 3,  max 5
		
		player = Setup.runIntro();
//		player.addToInventory(new Potion());
//		player.addToInventory(new Backpack());
//		player.addToInventory(new Item("egg", 5));
		Menu.createMainMenu();
		
//		player = Setup.buildCharacter();
		
//		Player.printPartyInfo();
//		Player Alice = new Player("Alice", 5, 5);

//		Player.addToParty("Alice", 5, 5);
//		Player.addToInventory(player, "egg");
//		Player.addToInventory("Alice", "diamond");
//		player.addToInventory(player, "rock");
//		Player.printInventory(player);
//		player.printEffects(player);

//		enemy = Enemy.newEnemy();
//		enemy.printEnemyStats();
		
		
//		player = new Player("Egg", 5, 5);
	}

}














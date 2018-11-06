package main;

import main.*;
import gen.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	private static int position = 0;
	private static int floor = 1;
	
	static int hallLength;
	static int floorNumber;
	
	//For GUI stuff
	private JButton calcButton;            // Triggers time calculation
	private JLabel playerLabel;            // Label for distance input
	private JLabel hpLabel;                // Label for fly time
	private JLabel hrsDriveLabel;          // Label for drive time
	private JTextField hrsFlyField;
	
	public static void incrementPosition() {
		position++;
	}
	public static int getPosition() {
		return position;
	}
	/*
	Everything() {
		GridBagConstraints layoutConst = null;
		setTitle("Game");
		playerLabel = new JLabel(player.getName());
		hpLabel = new JLabel(Integer.toString(player.getHp()));
		
		calcButton = new JButton("Calculate!");
		calcButton.addActionListener(this);	
		
		setLayout(new GridBagLayout());
		
		layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 1);
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 0;
	    add(playerLabel, layoutConst);
		
	    layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 10, 10, 1);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 0;
	    add(hpLabel, layoutConst);
	    
		layoutConst = new GridBagConstraints();
		layoutConst = new GridBagConstraints();
	    layoutConst.insets = new Insets(10, 5, 10, 10);
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 2;
	    add(calcButton, layoutConst);
	}
	*/
	
	public static void main(String[] args) {
		//Game game = new Game("Egg!", 300, 400);
		//game.start();
		
		hallLength = Setup.Flip(20) + 10; //Minimum hall length = 11, at end = stairs
		floorNumber = Setup.Flip(3) + 2; //Minimum length 3,  max 5
		
		
//		player = Setup.buildCharacter();
		
//		Player.printPartyInfo();
//		Player Alice = new Player("Alice", 5, 5);
		player = Setup.runIntro();
//		Player.addToParty("Alice", 5, 5);
//		Player.addToInventory(player, "egg");
//		Player.addToInventory("Alice", "diamond");
//		player.addToInventory(player, "rock");
//		Player.printInventory(player);
//		player.printEffects(player);
		Menu.createMainMenu();
//		enemy = Enemy.newEnemy();
//		enemy.printEnemyStats();
		
		
//		player = new Player("Egg", 5, 5);
//		
//		Everything myFrame = new Everything();
//		
//		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		myFrame.pack();
//		myFrame.setVisible(true);
	}
	/*
	@Override
	public void actionPerformed(ActionEvent event) {
//		player = Setup.buildCharacter();
		player = Setup.runIntro();
		playerLabel = new JLabel(player.getName());
	}
	*/
}














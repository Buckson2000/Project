package com.skillstorm.general;
import java.util.Scanner;

public class MainGameLogic {
	static Scanner scanner = new Scanner(System.in); 
	
	static FriendlyUnit unit; 
	
	//lets me know game is running
	public static boolean isRunning;

	public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};
	
	public static String[] enemies = {"Small Squad", "Small Squad", "Large Platoon", "Smal Squad", "55 Company"};	
	public static int place = 0, act = 1;
	public static String[] places = {"LZ Java ,Snake Valley, Hill 33, Dense Jungle, Base "};
	
	//for user input if they select something not an option
	public static int heyHey(String prompt, int userChoices) {
		int input; 
		
		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			}catch(Exception e) {
				input = -1;
				System.out.println("Select another number please");
			}
		}while(input < 1 || input >userChoices);
		return input;
	}
	
	
	//gives me 100 lines to make game easier to read
	public static void cleanScreen() {
		for( int i = 0; i<20; i++)
			System.out.println(); 
	}
	
	//will print the number of '*' as long as I input for n
	public static void starLine(int n) {
	     for(int i = 0; i< n; i++);
	     System.out.print("*");
	     System.out.println(); 
	}
	
	//For my titles
	public static void titleBox(String title) {
		starLine(30);
		System.out.println(title);
		starLine(30);
	}
	//will pause game until something is entered
	public static void toContinue() {
		System.out.println("\n Press 1 to continue");
		scanner.next(); 
	}
	

	//start game
	public static void run() {
		boolean nameset;//Lets you know if player has picked a name
		String name;
		//print main screen
		//cleanScreen(); 
		//starLine(50);
		//starLine(25);
		System.out.println("Radio Commander");
		System.out.println("    Vietnam ");
		System.out.println("by Bruce Buckson II");
		//starLine(25);
		//starLine(50);
		toContinue();
		//setting name
		cleanScreen();
		
		titleBox("Name Your company");
		name = scanner.next();
		
		Scenes.printLZJava();
		
		
		unit = new FriendlyUnit(name);
		
		//my intro to the game
		
		Scenes.printValley();
		
		// isRunning = true so loop continues
		isRunning = true;
		
		
		runLoop();
		
	}
	
	public static void checkPart() {
		if(unit.mor >=10 && act ==1) {
			act = 2;
			place = 1;
			
			Scenes.printValleyExit();
			unit.chooseSkill();
			Scenes.printValleymass();
			enemies[0] = "NVA";
			enemies[1] = "Rillas";
			enemies[2] = "NVA5";
			enemies[3] = "PSG";
			enemies[4] = "Rillas North";
			
			encounters[0] = "Battle";
			encounters[1] = "Battle";
			encounters[2] = "Battle";
			encounters[3] = "rest";
			encounters[4] = "resupply";
		}else if(unit.mor >= 50 && act == 2) {
			act = 3;
			place = 2;
			Scenes.printHilltop33();
			Scenes.printHilltop33exit();
			Scenes.printValleymass();
			enemies[0] = "NVA";
			enemies[1] = "Rillas";
			enemies[2] = "Warlords";
			enemies[3] = "PSG";
			enemies[4] = "NVA";
			
			encounters[0] = "Battle";
			encounters[1] = "Battle";
			encounters[2] = "Battle";
			encounters[3] = "rest";
			encounters[4] = "Battle";
		}else if (unit.mor >= 100 && act == 3) {
			act = 4;
			place = 3;
			Scenes.printHilltop33re();
			unit.chooseSkill();
			Scenes.printDenseJungle();
			//finalBattle();
		}
	}
	
	public static void randomEncounter() {
		//random number for encounters 0 and length
		int encounter = (int) (Math.random() * encounters.length);
		//calling the methods
		if(encounters[encounter].equals("Battle")) {
	}else if (encounters[encounter].equals("rest")) {
    }else 
			//resupply();
	}
	public static void continueMission() {
		
		checkPart();
		   if(act != 4)
			   randomEncounter();
		
	}
	
	public static void unitInfo() {
		titleBox("Unit Info");
		System.out.println(unit.name + "\tHP:" + unit.hp + "/" + unit.max); 
		System.out.println("Morale: " + unit.mor);
		
		//printing skills
		if(unit.numAirborne > 0) {
			System.out.println("Skill: " + unit.airborne[unit.numAirborne - 1]);
			starLine(10);
	     }
		if(unit.numHeavy > 0) {
		System.out.println("Skill: " + unit.heavy[unit.numHeavy - 1]);
		}
		toContinue();
	
		
   }
	public static void randomBattle() {
		cleanScreen();
		titleBox(" You are under attack");
		toContinue(); 
		
		battle(new Enemy(enemies[(int)(Math.random() * enemies.length)]), unit.mor);
	}
	
	public static void battle(Enemy enemy) {
		while(true) { 
			cleanScreen();
			titleBox(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.max);
			titleBox(unit.name + "\nHP: " + unit.hp + "/" + unit.max);
			System.out.println(" ")
	}
	}
	
	public static void printMenu() {
		titleBox(places[place]); 
		System.out.println("Select Course of action");
		System.out.println("1: Continue");
		System.out.println("2: Info");
		System.out.println("3: Quit");
	}
	
	public static void runLoop() {
		while(isRunning) {
			printMenu();
			int input = heyHey("->", 3);
			if(input == 1) {
				continueMission(); 
				 if(input == 2)
					unitInfo();
				else
					isRunning = false;
			}
		}
	}
	
	
}

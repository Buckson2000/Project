package com.skillstorm.general;
//Only stores methods for the story to be printed
public class Scenes {
	
	public static void printLZJava() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You're Company has just reached LZ Java");
		System.out.println("You're mission is to patrol and eliminate any hostile forces in the area.");
		System.out.println("\n------------------------------------------------------------------\n");
		MainGameLogic.toContinue();
	}
	public static void printValley() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART ONE - Snake Valley");
		MainGameLogic.starLine(10);
		System.out.println("You.re men reach Snake Valley, its known to be a very dangerous place");
		System.out.println("Some of your men seem on edge, and you're approaching a large river. ");
		MainGameLogic.toContinue();
	}
	
	public static void printValleyExit() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART ONE - Snake Valley");
		MainGameLogic.starLine(10);
		System.out.println("Everyone makes it across the river, however it has slowed you all down quite a bit");
		System.out.println("You had been in the open for an extended period of time");
		MainGameLogic.toContinue();
}

	public static void printValleymass() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART TWO - Snake Valley");
		MainGameLogic.starLine(10);
		System.out.println("You were seen by passing planes");
		System.out.println("However, they didnt recongize you as freindly and fired on you");
		System.out.println("Two of your platoons are decimated you can't continue as planned");
		MainGameLogic.toContinue();
	}
	
	public static void printHilltop33() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART TWO - Hill 33");
		MainGameLogic.starLine(10);
		System.out.println("You receive  intel that a platoon size element is moving through the valley towards you.");
		System.out.println("You dont have much time to prepare, and you belive that you have eye on them by a forward element. ");
		MainGameLogic.toContinue();
	}
	
	public static void printHilltop33exit() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART THREE - Hill 33");
		MainGameLogic.starLine(10);
		System.out.println("Youre plan was succssful, and no casualties were taken.");
		System.out.println("Youre asked if you feel confident assisting with another mission 1 click away ");
		System.out.println("However, half of your unit must stay so that the can provide safe passage for following units");
		MainGameLogic.toContinue();
	}
	
	public static void printHilltop33re() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART THREE - Hill 33");
		MainGameLogic.starLine(10);
		System.out.println("You spotted moving out ready, and you take indirect fire.");
		System.out.println("You retreat down the opposite side of the hill to the north. ");
		System.out.println("You make it to a safe area, but have lost communication with much of the company. ");
		System.out.println("You  must reach the rally point to regroup");
		MainGameLogic.toContinue();
	}
	
	public static void printDenseJungle() {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("PART FOUR - Dense Jungle");
		MainGameLogic.starLine(10);
		System.out.println("As you and you're small group begin to walk through the dense vegitation.");
		System.out.println("All you can think about is if the other parts of your're unit will be able to make it or complete their mission.");
		System.out.println("You plan to take a rest, when you hear gunshots ");
		MainGameLogic.toContinue();
	}
	

	
	public static void printFortBullet(FriendlyUnit unit) {
		MainGameLogic.cleanScreen();
		MainGameLogic.starLine(10);
		System.out.println("Congrats, you repelled the enemy");
		MainGameLogic.starLine(10);
		System.out.println("You and many of your men were able to survive");
		System.out.println("Members of " + unit.name + " will not be forgotten.");
		MainGameLogic.starLine(30);
		System.out.println("I hope you enjoyed the game");
		
	}
		
	
}
	
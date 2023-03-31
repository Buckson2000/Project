package com.skillstorm.general;
//Only stores methods for the story to be printed
public class Scenes {
	
	public static void printIntro() {
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at the gate of the town.");
		System.out.println("A guard is standing in front of you.");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Talk to the guard");
		System.out.println("2: Attack the guard");
		System.out.println("3: Leave");
		System.out.println("\n------------------------------------------------------------------\n");
	    toContinue();
	}

}

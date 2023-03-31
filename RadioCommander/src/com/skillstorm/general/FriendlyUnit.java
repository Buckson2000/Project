package com.skillstorm.general;

public class FriendlyUnit extends Units {

	//for number of unit skills
	public int numAirborne;
	public int numHeavy;
	
	
	//additional attributes
	int cash, restLeft, gres;
	//Unit skills
	public String[] airborne = {"Speed", "Raid", "Stealth", "Snipers"};
	public String[] heavy = {"Armor", "Air Support", "Fire Support", "Stamina increase"};
	
	public FriendlyUnit(String name) {
		super(name, 50, 100);
		// TODO Auto-generated constructor stub
		//Player will be able to choose
		this.numAirborne = 0;
		this.numHeavy = 0; 
		this.cash = 5;
		this.restLeft = 1;
		this.gres = 0;
		chooseSkill(); 
	
	}
    //Will be specific to my different units
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * (mor/3 + numAirborne * 3 + 2) + mor/5 + numAirborne * 2 + numHeavy + 7);
	}

	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * (mor/3 + numHeavy * 3 + 2) + mor/5 + numHeavy * 2 + numAirborne + 7);
	}
	
   public void chooseSkill() {
	MainGameLogic.cleanScreen(); 
	MainGameLogic.titleBox("Please select your unit speciality"); 
	System.out.println("1: " + airborne[numAirborne]);
	System.out.println("2: " + heavy[numHeavy]); 
	
	int input = MainGameLogic.heyHey("->", 2);
	if(input == 1) {
		MainGameLogic.titleBox("You've selected " + airborne[numAirborne]);
		//increasing the skills by one
		numAirborne++;
	}
	else {
		MainGameLogic.titleBox("You have selected " + heavy[numHeavy]);
		numHeavy++;
		
	}
		MainGameLogic.toContinue();
   }

}

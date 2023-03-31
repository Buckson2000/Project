package com.skillstorm.general;

public abstract class Units {
	
	//Traits everyone has, all units
	public String name;
	//Morale, Maximum HP/Combat power, HP
	public int mor;
	public int max;
	public int hp; 

	
	public Units(String name, int mor, int max) {
		this.name = name;
		this.mor = mor;
		this.max = max;
		this.hp = max;
	}
	public abstract int attack();
	public abstract int defense();
}

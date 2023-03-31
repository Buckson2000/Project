package com.skillstorm.general;

public class Enemy extends Units {

	int unitMor;
	
	
	
	public Enemy(String name, int unitMor) {
		super(name, (int) (Math.random() * unitMor  +  unitMor/2 + 5), (int) (Math.random() * (unitMor/5 + 10) + 1));
		this.unitMor = unitMor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack() {
		return (int) (Math.random() * (unitMor/3 + 1) + mor/4 + 3);
	}

	@Override
	public int defense() {
		return (int) (Math.random() * (unitMor/3 + 1) + mor/4 + 4);
	}

}

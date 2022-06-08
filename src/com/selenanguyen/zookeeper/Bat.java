package com.selenanguyen.zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		super();
		this.energyLevel=300;
	}
	
	// methods
	public void fly() {
		System.out.println("flap flap");
		this.setEnergyLevel(this.getEnergyLevel()-50);
		
		
	}
	
	public void eatHumans() {
		System.out.println("so- well, never mind!");
		this.setEnergyLevel(this.getEnergyLevel()+25);
		
	}
	
	public void attackTown() {
		System.out.println("Town is on Fire!");
		this.setEnergyLevel(this.getEnergyLevel()-100);
		
	}

}

package com.selenanguyen.zookeeper;

public class Gorilla extends Mammal {
	
	

	// methods
	public void throwSomething() {
		System.out.println("Gorilla thew a log");
		this.setEnergyLevel(this.getEnergyLevel()-5);
		
		
	}
	
	public void eatBananas() {
		System.out.println("Banana is yummy!");
		this.setEnergyLevel(this.getEnergyLevel()+10);
		
	}
	
	public void climb() {
		System.out.println("Gorilla climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
		
	}
	
	
	

}

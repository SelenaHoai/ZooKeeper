package com.selenanguyen.zookeeper;

public class TestMammal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gorilla babyGorilla = new Gorilla();
		babyGorilla.throwSomething();
		babyGorilla.throwSomething();
		babyGorilla.throwSomething();
		babyGorilla.eatBananas();
		babyGorilla.eatBananas();
		babyGorilla.climb();
		System.out.println("Energy Level: " + babyGorilla.getEnergyLevel() + "\n");
		
		
		Bat meanBat = new Bat();
		meanBat.attackTown();
		meanBat.attackTown();
		meanBat.attackTown();
		meanBat.eatHumans();
		meanBat.eatHumans();
		meanBat.fly();
		meanBat.fly();
		System.out.println("Energy Level: " + meanBat.getEnergyLevel() + "\n");
		

	}

}

package com.dailycode.designPattern;

public class StrategyMain {

	public static void main(String[] args) {
		Animal animal = new Duck("quack, quack sound", ()->"rivers");
		System.out.println(animal.animalDetails());
		animal = new Lion("Roars sound", ()->"Jungle");
		System.out.println(animal.animalDetails());
	}

}
class Animal{
	String sound;
	Home home;
	public Animal(String sound, Home home){
		this.sound = sound;
		this.home = home;
	}
	public String animalDetails() {
		return this.getClass().getSimpleName()+" makes "+sound+" lives in "+home.livingPlace();
	}

}
interface Home{
	String livingPlace();
}

class Duck extends Animal{
	public Duck(String sound, Home home){
		super(sound,home);
	}
}
class Lion extends Animal{
	public Lion(String sound, Home home){
		super(sound,home);
	}
}


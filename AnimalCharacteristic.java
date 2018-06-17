package com.test.animals;

import java.util.Scanner;
import java.util.HashMap;

public class AnimalCharacteristic {
	public static void main(String args[]){
		try{
			System.out.println("We have following animals baisc characterisc in our application");
			System.out.println("CHICKEN");
			System.out.println("DUCK");
			System.out.println("ROOSTER");
			System.out.println("PARROT");
			System.out.println("SHARK");
			System.out.println("CLOWNFISH");
			System.out.println("FROG");
			System.out.println("BUTTERFLY");
			System.out.println("CAT");
			System.out.println("DOG");
			System.out.println("DOLPHIN");
			
			System.out.println("Enter the number of Animals. Should be 1 to 11 only");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if(i<1 || i>11) {
				System.out.println("Enter the valid number. i.e 1 to 11");
				System.exit(0);
			}
			HashMap<String,Integer> countMap = new HashMap();
			String animalName = null;
			Bird bird = null;
			Fish fish = null;
			Animal animal =null;
			Butterfly butterfly = null;
			Dolphin dolphin = null;
			for(int j=1;j<=i;j++){
				System.out.println("Enter Animal "+j);
				animalName = sc.next();
				if(animalName.equalsIgnoreCase(Animal.CHICKEN) || animalName.equalsIgnoreCase(Animal.DUCK) || animalName.equalsIgnoreCase(Animal.ROOSTER)){
					bird = new Bird(countMap);
					bird.fly(animalName);
					bird.sing(animalName, null);
				}else if(animalName.equalsIgnoreCase(Animal.PARROT)){
					System.out.println("Parrot has following friends");
					System.out.println("DOG");
					System.out.println("CAT");
					System.out.println("ROOSTER");
					System.out.println("PHONE");
					System.out.println("Select one of the above friends to live with");
					String friendName = sc.next();
					bird = new Bird(countMap);
					bird.fly(animalName);
					bird.sing(animalName, friendName);
				}else if(animalName.equalsIgnoreCase(Animal.SHARK) || animalName.equalsIgnoreCase(Animal.CLOWNFISH)){
					fish = new Fish(countMap);
					fish.characteristic(animalName);
				}else if(animalName.equalsIgnoreCase(Animal.DOG) || animalName.equalsIgnoreCase(Animal.CAT) || animalName.equalsIgnoreCase(Animal.FROG)){
					animal = new Animal(countMap);
					animal.walk(animalName);
					animal.sing(animalName,null);
				}else if(animalName.equalsIgnoreCase(Animal.DOLPHIN)){
					dolphin = new Dolphin(countMap);
					dolphin.characteristic();
				}else if(animalName.equalsIgnoreCase(Animal.BUTTERFLY)){
					System.out.println("Enter age of butterfly");
					System.out.println("Enter 1 for Premature(caterpillar) stage");
					System.out.println("Enter 2 for matured stage");
					int age = sc.nextInt();
					if(age<1 || i>2) {
						System.out.println("Enter the valid age. i.e 1 or 2");
						System.exit(0);
					}
					
					butterfly = new Butterfly(countMap);
					butterfly.characteristic(age);				
				}else{
					System.out.println("We do not have the characteristc for the "+animalName+" at the moment");
				}
				
			}
			
			if(countMap!=null){
				
				System.out.println("*********Count details*********");
				Integer walk = countMap.get("WALK");
				if(walk==null)walk=0;
				System.out.println("Number of walking animals in the given list is "+walk);
				
				Integer fly = countMap.get("FLY");
				if(fly==null)fly=0;
				System.out.println("Number of flying animals in the given list is "+fly);

				Integer swim = countMap.get("SWIM");
				if(swim==null)swim=0;
				System.out.println("Number of swimming animals in the given list is "+swim);
				
				Integer sing = countMap.get("SING");
				if(sing==null)sing=0;
				System.out.println("Number of singing animals in the given list is "+sing);

				
			}
		}catch(Exception e){
//			e.printStackTrace();
			//System.out.println("Application error "+e.getMessage());
			System.out.println("Try again with valid input details");
		}
	}
}

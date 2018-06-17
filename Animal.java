package com.test.animals;

import java.util.HashMap;

class Animal {
	
	public static final String CHICKEN = "CHICKEN";
	public static final String DUCK = "DUCK";
	public static final String ROOSTER = "ROOSTER";
	public static final String PARROT = "PARROT";
	public static final String FISH = "FISH";
	public static final String SHARK = "SHARK";
	public static final String CLOWNFISH = "CLOWNFISH";
	public static final String FROG = "FROG";
	public static final String DOG = "DOG";
	public static final String BUTTERFLY = "BUTTERFLY";
	public static final String CAT = "CAT";
	public static final String PHONE = "PHONE";
	public static final String DOLPHIN = "DOLPHIN";
	
	public static final int BUUTERFLY_AGE_PREMATURE = 1;
	public static final int BUUTERFLY_AGE_MATURE = 2;
	
	HashMap countMap = null;
	
	Animal(HashMap countMap){
		this.countMap = countMap;
	}
	
	protected void walk(String animal)throws Exception{
		try{
			if(animal!=null && !animal.trim().equals("")){
				System.out.println(""+animal+" can walk");
				increaseCount("WALK", countMap);
			}else{
				System.out.println("Animal name is not provide");
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	protected void sing(String animal,String animalFriend)throws Exception{
		try{
			if(animal!=null && !animal.trim().equals("")){
				if(animal.equalsIgnoreCase(CHICKEN)){
					System.out.println(""+animal+" sings like Cluck, cluck");
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(DUCK)){
					System.out.println(""+animal+" sings like Quack, quack");
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(ROOSTER)){
					System.out.println(""+animal+" sings like Cock-a-doodle-doo");
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(PARROT)){
					if(animalFriend!=null && !animalFriend.trim().equals("")){
						if(animalFriend.equalsIgnoreCase(DOG)){
							System.out.println(""+animal+" sings like Woof, woof");
						}else if(animalFriend.equalsIgnoreCase(CAT)){
							System.out.println(""+animal+" sings like Meow,meow");
						}else if(animalFriend.equalsIgnoreCase(ROOSTER)){
							System.out.println(""+animal+" sings like Cock-a-doodle-doo");
						}else if(animalFriend.equalsIgnoreCase(DUCK)){
							System.out.println(""+animal+" sings like Quack, quack");
						}else if(animalFriend.equalsIgnoreCase(PHONE)){
							System.out.println(""+animal+" sings like Tring, Tring");
						}else{
							System.out.println(""+animal+" sings like ki ki ki ki");
						}
					}else{
						System.out.println(""+animal+" sings like ki ki ki ki");
					}
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(FROG)){
					System.out.println(""+animal+" sings like Frog,frog");
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(CAT)){
					System.out.println(""+animal+" sings like Meow,meow");
					increaseCount("SING", countMap);
				}else if(animal.equalsIgnoreCase(DOG)){
					System.out.println(""+animal+" sings like Woof, woof");
					increaseCount("SING", countMap);
				}else{
					System.out.println("Sorry, "+animal+" cannot Sing at the moment");
				}
			}else{
				System.out.println("Animal name is not provided");
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	protected void swim(String animal)throws Exception{
		try{
			if(animal!=null && !animal.trim().equals("")){
				System.out.println(""+animal+" can swim");
				increaseCount("SWIM", countMap);
			}else{
				System.out.println("Animal name is not provided");
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	protected void increaseCount(String key,HashMap<String,Integer> countMap)throws Exception{
		try{
			if(key!=null && !key.trim().equals("") && countMap!=null){
				int count = 1;
				Integer cnt = countMap.get(key);
				if(cnt!=null)count+=1;
				countMap.put(key, count);
			}else{
				System.out.println("Key or countMap to increase the count is null");
			}
		}catch(Exception e){
			throw e;
		}
	}
}

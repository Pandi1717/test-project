package com.test.animals;

import java.util.HashMap;

class Bird extends Animal {
	
	Bird(HashMap countMap){
		super(countMap);
	}
	protected void fly(String birdName) throws Exception{
		try{
			if(birdName!=null && !birdName.trim().equals("")){
				walk(birdName);
				System.out.println(""+birdName+" can fly");
				increaseCount("FLY", countMap);
			}else{
				System.out.println("Invalid bird name is provided");
			}
		}catch(Exception e){
			throw e;
		}
	}
}

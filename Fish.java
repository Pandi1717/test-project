package com.test.animals;

import java.util.HashMap;

public class Fish extends Animal {
	
	Fish(HashMap countMap){
		super(countMap);
	}
	
	public void characteristic(String fishType)throws Exception{
		try{
			if(fishType!=null && !fishType.equals("")){
				if(fishType.equalsIgnoreCase(SHARK)){
					swim(fishType);
					System.out.println("Size is large");
					System.out.println("Colour is grey");
					System.out.println("eats other fish");
				}else if(fishType.equalsIgnoreCase(CLOWNFISH)){
					swim(fishType);
					System.out.println("Size is small");
					System.out.println("Colour is orange");
					System.out.println("makes jokes");
				}
			}else{
				System.out.println("Valid fish type is not provided");
			}
		}catch(Exception e){
			throw e;
		}
	}
}

package com.test.animals;

import java.util.HashMap;

public class Dolphin extends Animal{
	
	Dolphin(HashMap countMap){
		super(countMap);
	}
	
	public void characteristic()throws Exception{
		try{
			swim(DOLPHIN);
		}catch(Exception e){
			throw e;
		}
	}

}

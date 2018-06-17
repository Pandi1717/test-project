package com.test.animals;

import java.util.HashMap;

class Butterfly extends Bird {
	Butterfly(HashMap countMap){
		super(countMap);
	}
	
	public void characteristic(int age)throws Exception{
		try{
			if(age == BUUTERFLY_AGE_PREMATURE){
				walk(BUTTERFLY);
			}else if(age == BUUTERFLY_AGE_MATURE){
				fly(BUTTERFLY);
			}else{
				System.out.println("Invalid butterfly age is provided");
			}
		}catch(Exception e){
			throw e;
		}
	}
}

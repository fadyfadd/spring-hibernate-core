package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomeService implements FortuneService {

	public String data[] = {"a" , "b" , "c"};
	@Override
	public String getFortune() {
		Random rnd = new Random(); 
		int i = rnd.nextInt(0 , data.length);
		return data[i];
		// TODO Auto-generated method stub
		 
	}

}

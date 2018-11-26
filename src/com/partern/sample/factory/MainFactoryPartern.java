package com.partern.sample.factory;

import com.partern.sample.factory.IDCard.IDCardFactory;
import com.partern.sample.factory.framework.Factory;
import com.partern.sample.factory.framework.Product;

public class MainFactoryPartern {

	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Ming");
		Product card2 = factory.create("Hong");
		Product card3 = factory.create("Gang");
		card1.use();
		card2.use();
		card3.use();
	}
}

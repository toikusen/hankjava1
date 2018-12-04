package com.tom;

public class Card {
	char[] suits = {0x2663,0x2666,0x2665,0x2660};
	int value;
	int symbol;
	int suit;
	public Card(int value){
		this.value = value;
	}
	
	public String print(){
		String s = (suits[value/13]) + "" + (value%13+1);
		return s;
	}
}
